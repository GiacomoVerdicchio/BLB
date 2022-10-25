package model.beast;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.ObjectMapper;
import model.beast.finalBosses.*;
import model.beast.normal.*;
import model.beast.bosses.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class CreatorBeasts {

    public static int numNormalBeasts=14;
    public static int numBosses=6;
    public static int numFinalBosses=5;

    public static Beast getRightCard(NameBeastsEnum type)
    {
        Beast card;

        Path fileName=getPath(type);
        ObjectMapper mapper = new ObjectMapper();

        mapper.setVisibility(PropertyAccessor.ALL, JsonAutoDetect.Visibility.NONE);
        mapper.setVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY);

        try {
            String str = Files.readString(fileName);

            card = switch (type) {
                //NORMAL BEASTS
                case BloodyCrowOfCainhurst -> mapper.readerFor(BloodyCrowOfCainhurst.class).readValue(str);
                case CarrionCrows -> mapper.readerFor(ScavengerCrows.class).readValue(str);
                case GardenOfEyes -> mapper.readerFor(GardenOfEyes.class).readValue(str);
                case HunterMinion -> mapper.readerFor(HunterMinion.class).readValue(str);
                case BeastPossessedSoul -> mapper.readerFor(BeastPossesedSoul.class).readValue(str);

                case BeastPatient -> mapper.readerFor(BeastPatient.class).readValue(str);
                case ManeaterBoar -> mapper.readerFor(ManeaterBoar.class).readValue(str);
                case ScourgeBeast -> mapper.readerFor(ScourgeBeast.class).readValue(str);
                case Huntsman -> mapper.readerFor(Huntsman.class).readValue(str);
                case FluorescentFlower -> mapper.readerFor(FluorescentFlower.class).readValue(str);

                case ChurchServant -> mapper.readerFor(ChurchServant.class).readValue(str);
                case Executioner -> mapper.readerFor(Executioner.class).readValue(str);
                case Brainsucker -> mapper.readerFor(Brainsucker.class).readValue(str);
                case Scholars-> mapper.readerFor(Scholars.class).readValue(str);

                //BOSSES
                case TheWitchOfHemwick ->mapper.readerFor(TheWitchOfHemwick.class).readValue(str);
                case ClericBeast -> mapper.readerFor(ClericBeast.class).readValue(str);
                case MartyrLogarius -> mapper.readerFor(MartyrLogarius.class).readValue(str);
                case TheOneReborn -> mapper.readerFor(TheOneReborn.class).readValue(str);
                case Ebrietas -> mapper.readerFor(Ebrietas.class).readValue(str);
                case WatchDogOfTheOldLords -> mapper.readerFor(WatchDogOfTheOldLords.class).readValue(str);

                //FINAL BOSSES
                case VicarAmelia -> mapper.readerFor(VicarAmelia.class).readValue(str);
                case GehrmanTheFirstHunter -> mapper.readerFor(GehrmanTheFirstHunter.class).readValue(str);
                case MergosWetNurse -> mapper.readerFor(MergosWetNurse.class).readValue(str);
                case RomTheVacuousSpider -> mapper.readerFor(RomTheVacuousSpider.class).readValue(str);
                case MicolashHostOfTheNightmare -> mapper.readerFor(MicolashHostOfTheNightmare.class).readValue(str);
            };

        }
        catch (IOException e) {
            card=null;
            e.printStackTrace();
        }
        return  card;
    }

    /**A method that take the type and choose the correct path.  NB   The name of the json must be the same of the type**/
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
