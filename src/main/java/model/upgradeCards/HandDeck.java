package model.upgradeCards;

import java.util.ArrayList;

public class HandDeck {
    private ArrayList<UpgradeCard> deck;


    public HandDeck()
    {
        deck= new ArrayList<>();

        //TODO ogni volta che aggiungo devo aggiornare gli indici iniziali
        deck.add(CreatorUpgradeCard.getRightCard(NameUpgradeCardEnum.values()[0]));
        deck.add(CreatorUpgradeCard.getRightCard(NameUpgradeCardEnum.values()[1]));
        deck.add(CreatorUpgradeCard.getRightCard(NameUpgradeCardEnum.values()[2]));
        deck.add(CreatorUpgradeCard.getRightCard(NameUpgradeCardEnum.values()[3]));
        deck.add(CreatorUpgradeCard.getRightCard(NameUpgradeCardEnum.values()[4]));
    }


    public static UpgradeCard pickCard(NameUpgradeCardEnum nameOfCard , ArrayList<UpgradeCard> deck)
    {
        for(UpgradeCard card : deck)
            if (card.getNameCode() == nameOfCard)
                return card;
        return null;
    }

    public void addToDeck(NameUpgradeCardEnum nameUpgradeEnum){ deck.add(CreatorUpgradeCard.getRightCard(nameUpgradeEnum));}
    public void addToDeck(UpgradeCard upgradeCard) { deck.add(upgradeCard); }
    public void removeFromDeck(UpgradeCard upgradeCard){deck.remove(upgradeCard);}
    public void removeFromDeck(NameUpgradeCardEnum nameOfCard){
        this.getDeck().remove(pickCard(nameOfCard,this.getDeck()));
    }
    public void removeFromDeck(int index)
    {
        this.getDeck().remove(index);
    }

    public void moveToDiscard(UpgradeCard upgradeCard, DiscardDeck discardDeck)
    {
        deck.remove(upgradeCard);
        discardDeck.addToDiscardPile(upgradeCard);
    }
    public void moveToDiscard(NameUpgradeCardEnum nameOfCard, DiscardDeck discardDeck)
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

    public ArrayList<UpgradeCard> getDeck() { return deck; }
}
