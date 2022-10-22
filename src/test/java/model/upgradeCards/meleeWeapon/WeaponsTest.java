package model.upgradeCards.meleeWeapon;

import model.upgradeCards.cards.meleeWeapons.HunterAxe;
import model.upgradeCards.cards.meleeWeapons.ToothedCleaver;
import org.junit.Test;

public class WeaponsTest {

    HunterAxe axe;
    ToothedCleaver tcl;

    @Test
    public void testConstructorAxe()
    {
        axe=new HunterAxe();

        System.out.println(axe.getName()+": "+axe.getDescription()+" damage: "+axe.getDamage());
    }
    @Test
    public void testConstructorCleaver()
    {
        tcl=new ToothedCleaver();

        System.out.println(tcl.getName()+": "+tcl.getDescription()+" damage: "+tcl.getDamage()+" (code: "+ tcl.getNameCode()+")");
    }
}
