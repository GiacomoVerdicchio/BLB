package model.upgradeCards;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UpgradeDeckTest {

    @Test
    public void testDeck()
    {
        UpgradeDeck upgradeDeck=new UpgradeDeck();

        assertEquals(5,upgradeDeck.getUpgradeDeck().size());
    }
}
