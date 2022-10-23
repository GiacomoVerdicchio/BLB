package model.upgradeCards;

import model.upgradeCards.cards.basicCards.SawCleaver;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DiscardDeckTest {
    private DiscardDeck dc;

    @Test
    public void construct()
    {
        dc=new DiscardDeck();
        SawCleaver tc=new SawCleaver();


        dc.addToDiscardPile(tc);
        assertEquals(1,dc.getDiscardPile().size());
        assertEquals(tc.nameCode,dc.getDiscardPile().get(0).nameCode);
        dc.removeFromDiscard(tc);
        assertEquals(0,dc.getDiscardPile().size());


        dc.addToDiscardPile(tc);
        dc.addToDiscardPile(tc);
        dc.addToDiscardPile(tc);
        assertEquals(3,dc.getDiscardPile().size());
        dc.removeAllFromDiscardPile();
        assertEquals(0,dc.getDiscardPile().size());
    }
}
