package model.upgradeCards;

import com.fasterxml.jackson.databind.ObjectMapper;
import model.upgradeCards.cards.basicCards.*;
import model.upgradeCards.cards.meleeWeapons.SawSpear;
import model.upgradeCards.cards.meleeWeapons.ThreadedCane;
import model.upgradeCards.cards.rangedWeapons.FlameSprayer;
import model.upgradeCards.cards.rangedWeapons.HunterBlunderbuss;
import model.upgradeCards.cards.utilityCards.BloodVial;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class CreatorUpgradeCard {

    public static final int numberOfWeapons=5;
    public static final int numberOfMeleeWeapons=2; //count the number of classes in melee folder-1
    public static final int numberOfRangedWeapons=2;//count the number of classes in ranged folder-1
    public static final int numberOfUtilityCards=1;


    public static UpgradeCard getRightCard(NameUpgradeCardEnum type)
    {
        UpgradeCard card;

        Path fileName=getPath(type);
        ObjectMapper mapper = new ObjectMapper();

        try {
            String str = Files.readString(fileName);

            card = switch (type) {
                //ARMI DA MISCHIA
                case SawCleaver -> mapper.readerFor(SawCleaver.class).readValue(str);
                case HunterAxe -> mapper.readerFor(HunterAxe.class).readValue(str);
                case SawSpear -> mapper.readerFor(SawSpear.class).readValue(str);
                case ThreadedCane -> mapper.readerFor(ThreadedCane.class).readValue(str);

                //ARMI RANGED
                case HunterPistol -> mapper.readerFor(HunterPistol.class).readValue(str);
                case FlameSprayer -> mapper.readerFor(FlameSprayer.class).readValue(str);
                case HunterBlunderbuss -> mapper.readerFor(HunterBlunderbuss.class).readValue(str);

                //UTILITES
                case HunterDream -> mapper.readerFor(HunterDream.class).readValue(str);
                case Transformation -> mapper.readerFor(Transformation.class).readValue(str);
                case BloodVial -> mapper.readerFor(BloodVial.class).readValue(str);


            };

        }
        catch (IOException e) {
            card=null;
            e.printStackTrace();
        }
        return  card;
    }

    private static Path getPath(NameUpgradeCardEnum type)
    {
        if(type.ordinal()<5)
            return Path.of("src/main/resources/UpgradeCards/basicCards/"+type+".json");
        else if(type.ordinal()<numberOfMeleeWeapons+5)
            return Path.of("src/main/resources/UpgradeCards/AllOthers/Melee/"+type+".json");
        else if (type.ordinal()<(numberOfMeleeWeapons+numberOfRangedWeapons+5))
            return Path.of("src/main/resources/UpgradeCards/AllOthers/RangedWeapons/"+type+".json");
        else
            return Path.of("src/main/resources/UpgradeCards/AllOthers/UtilityCards/"+type+".json");
    }
}
