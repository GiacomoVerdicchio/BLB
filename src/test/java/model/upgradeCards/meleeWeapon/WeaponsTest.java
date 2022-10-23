package model.upgradeCards.meleeWeapon;

import model.upgradeCards.CardCreator;
import model.upgradeCards.NameUpgradeEnum;
import model.upgradeCards.cards.basicCards.HunterAxe;
import model.upgradeCards.cards.basicCards.SawCleaver;
import org.junit.Test;

public class WeaponsTest {

    HunterAxe axe;
    SawCleaver tcl;

    @Test
    public void testConstructorAxe()
    {
        axe= (HunterAxe) CardCreator.getRightCard(NameUpgradeEnum.values()[1]);
        axe.getDamage();
        //System.out.println(axe.getEnglishName()+": "+axe.getEnglishDescription()+" damage: "+axe.getDamage());
    }
    @Test
    public void testConstructorCleaver()
    {
        tcl=new SawCleaver();

        //System.out.println(tcl.getEnglishName()+": "+tcl.getEnglishDescription()+" damage: "+tcl.getDamage()+" (code: "+ tcl.getNameCode()+")");
    }
}
