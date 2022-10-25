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

        Beast manater= CreatorBeasts.getRightCard(NameBeastsEnum.ManeaterBoar);
        System.out.println(manater.getNameBeastsEnum()+" : "+ manater.getName()[0]+" "+ manater.getBaseBloodEchos());

        Beast scou= CreatorBeasts.getRightCard(NameBeastsEnum.ScourgeBeast);
        System.out.println(scou.getNameBeastsEnum()+" : "+ scou.getName()[0]+" "+ scou.getBaseBloodEchos()+" dice:"+scou.getDice());

        Beast hunt= CreatorBeasts.getRightCard(NameBeastsEnum.Huntsman);
        System.out.println(hunt.getNameBeastsEnum()+" : "+ hunt.getName()[0]+" "+ hunt.getBaseBloodEchos()+" dice:"+hunt.getDice());

        Beast fluo= CreatorBeasts.getRightCard(NameBeastsEnum.FluorescentFlower);
        System.out.println(fluo.getNameBeastsEnum()+" : "+ fluo.getName()[0]+" "+ fluo.getBaseBloodEchos()+" dice:"+fluo.getDice());

        Beast prete= CreatorBeasts.getRightCard(NameBeastsEnum.ChurchServant);
        System.out.println(prete.getNameBeastsEnum()+" : "+ prete.getName()[0]+" "+ prete.getBaseBloodEchos()+" dice:"+prete.getDice());

        Beast giustice= CreatorBeasts.getRightCard(NameBeastsEnum.Executioner);
        System.out.println(giustice.getNameBeastsEnum()+" : "+ giustice.getName()[0]+" "+ giustice.getBaseBloodEchos()+" dice:"+giustice.getDice());

        Beast succhicazzi= CreatorBeasts.getRightCard(NameBeastsEnum.Brainsucker);
        System.out.println(succhicazzi.getNameBeastsEnum()+" : "+ succhicazzi.getName()[0]+" "+ succhicazzi.getBaseBloodEchos()+" dice:"+succhicazzi.getDice());

        Beast studing= CreatorBeasts.getRightCard(NameBeastsEnum.Scholars);
        System.out.println(studing.getNameBeastsEnum()+" : "+ studing.getName()[0]+" "+ studing.getBaseBloodEchos()+" dice:"+studing.getDice());
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

        Beast theone= CreatorBeasts.getRightCard(NameBeastsEnum.TheOneReborn);
        System.out.println(theone.getNameBeastsEnum()+" : "+ theone.getName()[0]+" "+ theone.getBaseBloodEchos());

        Beast cagnooo= CreatorBeasts.getRightCard(NameBeastsEnum.WatchDogOfTheOldLords);
        System.out.println(cagnooo.getNameBeastsEnum()+" : "+ cagnooo.getName()[0]+" "+ cagnooo.getBaseBloodEchos()+" dice:"+cagnooo.getDice());

    }
    @Test
    public void testCreationFinalBosses()
    {
        Beast vicario = CreatorBeasts.getRightCard(NameBeastsEnum.VicarAmelia);
        System.out.println(vicario.getNameBeastsEnum() + " : " + vicario.getNameBeastsEnum() + " " + vicario.getBaseBloodEchos());

        Beast gerry = CreatorBeasts.getRightCard(NameBeastsEnum.GehrmanTheFirstHunter);
        System.out.println(gerry.getNameBeastsEnum() + " : " + gerry.getNameBeastsEnum() + " " + gerry.getBaseBloodEchos()+" dice:"+gerry.getDice());

        Beast laMamma = CreatorBeasts.getRightCard(NameBeastsEnum.MergosWetNurse);
        System.out.println(laMamma.getNameBeastsEnum() + " : " + laMamma.getNameBeastsEnum() + " " + laMamma.getBaseBloodEchos()+" dice:"+laMamma.getDice());

        Beast rom = CreatorBeasts.getRightCard(NameBeastsEnum.RomTheVacuousSpider);
        System.out.println(rom.getNameBeastsEnum() + " : " + rom.getNameBeastsEnum() + " " + rom.getBaseBloodEchos()+" dice:"+rom.getDice());

        Beast mich = CreatorBeasts.getRightCard(NameBeastsEnum.MicolashHostOfTheNightmare);
        System.out.println(mich.getNameBeastsEnum() + " : " + mich.getNameBeastsEnum() + " " + mich.getBaseBloodEchos()+" dice:"+mich.getDice());
    }
}
