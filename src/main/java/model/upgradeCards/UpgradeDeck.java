package model.upgradeCards;

import java.util.ArrayList;
import java.util.Collections;

public class UpgradeDeck {
    private ArrayList<UpgradeCard> upgradeDeck;
    private ArrayList<UpgradeCard> upgradeBoard;

    public UpgradeDeck()
    {
        upgradeDeck = new ArrayList<>();

        upgradeDeck.add(CardCreator.getRightCard(NameUpgradeEnum.values()[0]));
        upgradeDeck.add(CardCreator.getRightCard(NameUpgradeEnum.values()[1]));
        upgradeDeck.add(CardCreator.getRightCard(NameUpgradeEnum.values()[2]));
        upgradeDeck.add(CardCreator.getRightCard(NameUpgradeEnum.values()[3]));
        upgradeDeck.add(CardCreator.getRightCard(NameUpgradeEnum.values()[4]));
        upgradeDeck.add(CardCreator.getRightCard(NameUpgradeEnum.values()[0]));
        upgradeDeck.add(CardCreator.getRightCard(NameUpgradeEnum.values()[1]));
        upgradeDeck.add(CardCreator.getRightCard(NameUpgradeEnum.values()[2]));
        upgradeDeck.add(CardCreator.getRightCard(NameUpgradeEnum.values()[3]));
        upgradeDeck.add(CardCreator.getRightCard(NameUpgradeEnum.values()[4]));

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
    public ArrayList<UpgradeCard> getUpgradeDeck(){ return upgradeDeck;}
    public ArrayList<UpgradeCard> getUpgradeBoard() { return upgradeBoard; }
}
