package model.upgradeCards;

import java.util.ArrayList;
import java.util.Collections;

public class UpgradeDeck {
    private ArrayList<UpgradeCard> upgradeDeck;
    private ArrayList<UpgradeCard> upgradeBoard;

    public UpgradeDeck()
    {
        upgradeDeck = new ArrayList<>();

        upgradeDeck.add(CreatorUpgradeCard.getRightCard(NameUpgradeCardEnum.values()[5]));
        upgradeDeck.add(CreatorUpgradeCard.getRightCard(NameUpgradeCardEnum.values()[6]));
        upgradeDeck.add(CreatorUpgradeCard.getRightCard(NameUpgradeCardEnum.values()[7]));
        upgradeDeck.add(CreatorUpgradeCard.getRightCard(NameUpgradeCardEnum.values()[8]));
        upgradeDeck.add(CreatorUpgradeCard.getRightCard(NameUpgradeCardEnum.values()[9]));


        Collections.shuffle(upgradeDeck);

        upgradeBoard = new ArrayList<>();
    }

    //TODO testare questa funzione
    public void prepareUpgradeDeck(int numPlayer)
    {
        for(int i=0;i<numPlayer;i++)
        {
            upgradeBoard.add(upgradeDeck.get(0));
            upgradeDeck.remove(0);
        }
    }

    public void refill(int numPlayer)
    {
        while(upgradeBoard.size()<numPlayer)
        {
            upgradeBoard.add(upgradeDeck.get(0));
            upgradeDeck.remove(0);
        }
    }

    public void add(int index) { upgradeDeck.add(CreatorUpgradeCard.getRightCard(NameUpgradeCardEnum.values()[index])); }
    public void add(NameUpgradeCardEnum name) { upgradeDeck.add(CreatorUpgradeCard.getRightCard(name)); }

    public ArrayList<UpgradeCard> getUpgradeDeck(){ return upgradeDeck;}
    public ArrayList<UpgradeCard> getUpgradeBoard() { return upgradeBoard; }
}
