package model.upgradeCards.meleeWeapon;

import model.upgradeCards.cards.meleeWeapons.HunterAxe;
import org.junit.Test;

public class HunterAxeTest {

    HunterAxe axe;

    @Test
    public void testConstructor()
    {
        axe=new HunterAxe();
        axe.populatingHuntAxe();

        System.out.println(axe.getNameCode()+": "+axe.getDescription());
    }
}
