package model.upgradeCards;

import model.upgradeCards.cards.meleeWeapons.*;
import model.upgradeCards.cards.utilityCards.*;
import org.junit.Test;

import static org.junit.Assert.*;

public class HandDeckTest {


    @Test
    public void testDeck()
    {
        HandDeck deck = new HandDeck();
        DiscardDeck discardDeck=new DiscardDeck();
        UpgradeCard toothedCleaver=HandDeck.pickCard(NameUpgradeEnum.ToothedCleaver,deck.getDeck());
        assertEquals(5,deck.getDeck().size());

        assertEquals(5, deck.getDeck().size());
        assertTrue(deck.getDeck().get(0) instanceof ToothedCleaver);
        deck.getDeck().remove(toothedCleaver);
        assertEquals(4,deck.getDeck().size());

        //Remove by name
        deck.removeFromDeck(NameUpgradeEnum.HunterAxe);
        assertEquals(3,deck.getDeck().size());

        //Adding again the TootheCleaver
        deck.addToDeck(toothedCleaver);
        assertEquals(4,deck.getDeck().size());

        //Remove by object type
        deck.removeFromDeck(toothedCleaver);
        assertEquals(3,deck.getDeck().size());

        deck.moveToDiscard(NameUpgradeEnum.Transformation,discardDeck);
        assertEquals(2,deck.getDeck().size());
        assertEquals(1,discardDeck.getDiscardPile().size());

        UpgradeCard upCard=HandDeck.pickCard(NameUpgradeEnum.Transformation,discardDeck.getDiscardPile());
        assertTrue(discardDeck.getDiscardPile().get(0) instanceof Transformation);

        //Remove all the instance of ToothedCleaver
        deck.removeFromDeck(toothedCleaver);
        assertNull(deck.pickCard(NameUpgradeEnum.ToothedCleaver, deck.getDeck()));

        //Reset the discard and the deck pile,adding 2 toothedCleaver and moving them in the discard pile
        discardDeck.removeAllFromDiscardPile();
        deck.removeAllFromDeck();
        assertEquals(0,deck.getDeck().size());
        assertEquals(0,discardDeck.getDiscardPile().size());

    }


    @Test
    public void testCostruzioneHand()
    {
        HandDeck deck = new HandDeck();
        assertEquals(deck.getDeck().size(),5);
        deck.removeAllFromDeck();
        assertEquals(0,deck.getDeck().size());

    }


    @Test
    public void testCleaverNewJson()
    {

        HandDeck deck=new HandDeck();
        DiscardDeck discardDeck=new DiscardDeck();
        discardDeck.removeAllFromDiscardPile();

        assertEquals(5,deck.getDeck().size());
        assertEquals(0,discardDeck.getDiscardPile().size());

        deck.removeAllFromDeck();
        deck.addToDeck(NameUpgradeEnum.ToothedCleaver);
        deck.addToDeck(NameUpgradeEnum.ToothedCleaver);
        deck.moveToDiscard (HandDeck.pickCard(  NameUpgradeEnum.ToothedCleaver ,deck.getDeck()), discardDeck);

        deck.moveToDiscard(NameUpgradeEnum.ToothedCleaver, discardDeck);

        assertEquals(2,discardDeck.getDiscardPile().size());
        assertEquals(0,deck.getDeck().size());
        discardDeck.removeAllFromDiscardPile();
    }

}
