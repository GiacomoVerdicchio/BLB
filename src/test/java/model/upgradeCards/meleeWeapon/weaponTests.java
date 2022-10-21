package model.upgradeCards.meleeWeapon;

import model.upgradeCards.cards.meleeWeapons.HunterAxe;
import model.upgradeCards.cards.meleeWeapons.ToothedCleaver;
import org.junit.Test;

public class weaponTests {

    HunterAxe axe;
    ToothedCleaver tcl;

    @Test
    public void testConstructorAxe()
    {
        axe=new HunterAxe();
        axe.populating();

        System.out.println(axe.getName()+": "+axe.getDescription()+" damage: "+axe.getDamage());
    }
    @Test
    public void testConstructorCleaver()
    {
        tcl=new ToothedCleaver();
        tcl.populating();

        System.out.println(tcl.getName()+": "+tcl.getDescription()+" damage: "+tcl.getDamage()+" (code: "+ tcl.getNameCode()+")");
    }
}
