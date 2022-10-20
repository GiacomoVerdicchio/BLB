package model.upgradeCards;

public abstract class UpgradeCard {
    protected String description;
    protected nameUpgradeEnum name;


    //public abstract void effect(CurrentGameState cg);

    public String getDescription() {
        return description;
    }
    public nameUpgradeEnum getName() {
        return name;
    }
}
