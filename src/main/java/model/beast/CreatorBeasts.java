package model.beast;

import com.fasterxml.jackson.databind.ObjectMapper;
import model.beast.bosses.TheWitchOfHemwick;
import model.beast.normal.BloodyCrowOfCainhurst;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class CreatorBeasts {

    private static int numNormalBeasts=1;
    private static int numBosses=1;
    private static int numFinalBosses=0;

    public static Beast getRightCard(NameBeastsEnum type)
    {
        Beast card;

        Path fileName=getPath(type);
        ObjectMapper mapper = new ObjectMapper();

        try {
            String str = Files.readString(fileName);

            card = switch (type) {
                //NORMAL BEASTS
                case BloodyCrowOfCainhurst -> mapper.readerFor(BloodyCrowOfCainhurst.class).readValue(str);

                //BOSSES
                case TheWitchOfHemwick ->mapper.readerFor(TheWitchOfHemwick.class).readValue(str);

                //FINAL BOSSES


            };

        }
        catch (IOException e) {
            card=null;
            e.printStackTrace();
        }
        return  card;
    }

    private static Path getPath(NameBeastsEnum type)
    {
        if(type.ordinal()<numNormalBeasts)
            return Path.of("src/main/resources/Beasts/Normal/"+type+".json");
        else if (type.ordinal()<(numNormalBeasts+ numBosses))
            return Path.of("src/main/resources/Beasts/Bosses/"+type+".json");
        else
            return Path.of("src/main/resources/Beasts/FinalBosses/"+type+".json");
    }
}
