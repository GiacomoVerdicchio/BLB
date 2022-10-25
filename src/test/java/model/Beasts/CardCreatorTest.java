package model.Beasts;

import model.beast.Beast;
import model.beast.CreatorBeasts;
import model.beast.NameBeastsEnum;
import org.junit.Test;

public class CardCreatorTest {


    @Test
    public void testCreationNormalBeasts()
    {
        Beast crown= CreatorBeasts.getRightCard(NameBeastsEnum.BloodyCrowOfCainhurst);
        System.out.println(crown.getNameBeastsEnum()+" : "+ crown.getName()[0]+" "+ crown.getBaseBloodEchos());

        Beast crowss= CreatorBeasts.getRightCard(NameBeastsEnum.CarrionCrows);
        System.out.println(crowss.getNameBeastsEnum()+" : "+ crowss.getName()[0]+" "+ crowss.getBaseBloodEchos());

        Beast garden= CreatorBeasts.getRightCard(NameBeastsEnum.GardenOfEyes);
        System.out.println(garden.getNameBeastsEnum()+" : "+ garden.getName()[0]+" "+ garden.getBaseBloodEchos());

        Beast minion= CreatorBeasts.getRightCard(NameBeastsEnum.HunterMinion);
        System.out.println(minion.getNameBeastsEnum()+" : "+ minion.getName()[0]+" "+ minion.getBaseBloodEchos());

        Beast posseSoul= CreatorBeasts.getRightCard(NameBeastsEnum.BeastPossessedSoul);
        System.out.println(posseSoul.getNameBeastsEnum()+" : "+ posseSoul.getName()[0]+" "+ posseSoul.getBaseBloodEchos());

        Beast possePat= CreatorBeasts.getRightCard(NameBeastsEnum.BeastPatient);
        System.out.println(possePat.getNameBeastsEnum()+" : "+ possePat.getName()[0]+" "+ possePat.getBaseBloodEchos());


    }
    @Test
    public void testCreationBosses()
    {
        Beast witch= CreatorBeasts.getRightCard(NameBeastsEnum.TheWitchOfHemwick);
        System.out.println(witch.getNameBeastsEnum()+" : "+ witch.getNameBeastsEnum()+" "+ witch.getBaseBloodEchos());

        Beast cleric= CreatorBeasts.getRightCard(NameBeastsEnum.ClericBeast);
        System.out.println(cleric.getNameBeastsEnum()+" : "+ cleric.getNameBeastsEnum()+" "+ cleric.getBaseBloodEchos());

        Beast martyr= CreatorBeasts.getRightCard(NameBeastsEnum.MartyrLogarius);
        System.out.println(martyr.getNameBeastsEnum()+" : "+ martyr.getName()[0]+" "+ martyr.getBaseBloodEchos());

    }
    @Test
    public void testCreationFinalBosses()
    {
        Beast vicario = CreatorBeasts.getRightCard(NameBeastsEnum.VicarAmelia);
        System.out.println(vicario.getNameBeastsEnum() + " : " + vicario.getNameBeastsEnum() + " " + vicario.getBaseBloodEchos());
    }
}
