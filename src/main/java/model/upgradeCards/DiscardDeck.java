package model.upgradeCards;

import java.util.ArrayList;

public class DiscardDeck {
    private ArrayList<UpgradeCard> discardPile;

    public DiscardDeck()
    {
        discardPile = new ArrayList<>();
    }


    public void addToDiscardPile(UpgradeCard upgradeCard) {discardPile.add(upgradeCard);}
    public UpgradeCard removeFromDiscard(UpgradeCard upgradeCard)
    {
        discardPile.remove(upgradeCard);
        return upgradeCard;
    }
    public void removeAllFromDiscardPile()
    {
        while(!discardPile.isEmpty())
            discardPile.remove(0);
    }
    public ArrayList<UpgradeCard> getDiscardPile() {
        return discardPile;
    }
}
