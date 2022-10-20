package model.upgradeCards;

import model.upgradeCards.cards.rangedWeapons.*;
import model.upgradeCards.cards.meleeWeapons.*;
import model.upgradeCards.cards.utilityCards.*;

import java.util.ArrayList;

public class HandDeck {
    private ArrayList<UpgradeCard> deck;

    public HandDeck()
    {
        deck=new ArrayList<UpgradeCard>();
        deck.add(new ToothedCleaver());
        deck.add(new Transformation());
        deck.add(new HunterPistol());
        deck.add(new HunterDream());
        deck.add(new HunterAxe());
    }


    public static UpgradeCard pickCard(nameUpgradeEnum nameOfCard , ArrayList<UpgradeCard> deck)
    {
        for(UpgradeCard card : deck)
            if (card.getName() == nameOfCard)
                return card;
        return null;
    }


    public void addToDeck(UpgradeCard upgradeCard)
    {
        deck.add(upgradeCard);
    }
    public void removeFromDeck(UpgradeCard upgradeCard){deck.remove(upgradeCard);}
    public void removeFromDeck(nameUpgradeEnum nameOfCard,HandDeck deck){
        deck.getDeck().remove(pickCard(nameOfCard,deck.getDeck()));
    }
    public void moveToDiscard(UpgradeCard upgradeCard, DiscardDeck discardDeck)
    {
        deck.remove(upgradeCard);
        discardDeck.addToDiscardPile(upgradeCard);
    }
    public void moveToDiscard(nameUpgradeEnum nameOfCard, DiscardDeck discardDeck)
    {
        UpgradeCard up=pickCard(nameOfCard,deck);
        deck.remove(up);
        discardDeck.addToDiscardPile(up);
    }

    public void removeAllFromDeck()
    {
        while(!deck.isEmpty())
            deck.remove(0);
    }

    public ArrayList<UpgradeCard> getDeck()
    {
        return deck;
    }
}
