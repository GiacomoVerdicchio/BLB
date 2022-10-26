package model.upgradeCards;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UpgradeDeckTest {

    @Test
    public void testDeck()
    {
        UpgradeDeck upgradeDeck=new UpgradeDeck();

        assertEquals(5,upgradeDeck.getUpgradeDeck().size());
        upgradeDeck.prepareUpgradeDeck(3);
        assertEquals(2,upgradeDeck.getUpgradeDeck().size());


        upgradeDeck.getUpgradeBoard().remove(0);
        assertEquals(2,upgradeDeck.getUpgradeBoard().size());
        upgradeDeck.refill(3);

        upgradeDeck.add(NameUpgradeCardEnum.HunterAxe);
        assertEquals(2,upgradeDeck.getUpgradeDeck().size());
    }
}
