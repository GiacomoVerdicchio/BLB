package model.upgradeCards;

import com.fasterxml.jackson.databind.ObjectMapper;
import model.upgradeCards.cards.meleeWeapons.*;
import model.upgradeCards.cards.rangedWeapons.*;
import model.upgradeCards.cards.utilityCards.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class CardCreator {

    public static int numberOfRangedWeapons=UpgradeCard.numberOfRangedWeapons;
    public static int numberOfMeleeWeapons=UpgradeCard.numberOfMeleeWeapons;


    public static UpgradeCard getRightCard(NameUpgradeEnum type)
    {
        UpgradeCard card;

        Path fileName=getPath(type);
        ObjectMapper mapper = new ObjectMapper();

        try {
            String str = Files.readString(fileName);

            card = switch (type) {
                //ARMI DA MISCHIA
                case ToothedCleaver -> mapper.readerFor(ToothedCleaver.class).readValue(str);
                case HunterAxe -> mapper.readerFor(HunterAxe.class).readValue(str);

                //ARMI RANGED
                case HunterPistol -> mapper.readerFor(HunterPistol.class).readValue(str);


                //UTILITES
                case HunterDream -> mapper.readerFor(HunterDream.class).readValue(str);
                case Transformation -> mapper.readerFor(Transformation.class).readValue(str);


                default -> throw new IllegalStateException("Unexpected value: " + type);
            };

        }
        catch (IOException e) {
            card=null;
            e.printStackTrace();
        }
        return  card;
    }

    private static Path getPath(NameUpgradeEnum type)
    {
        if(type.ordinal()<numberOfMeleeWeapons)
            return Path.of("src/main/resources/MeleeWeapons/"+type+".json");
        else if (type.ordinal()<(numberOfMeleeWeapons+numberOfRangedWeapons))
            return Path.of("src/main/resources/RangedWeapons/"+type+".json");
        else
            return Path.of("src/main/resources/UtilityCards/"+type+".json");
    }
}
