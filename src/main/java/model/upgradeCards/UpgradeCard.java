package model.upgradeCards;

public abstract class UpgradeCard {

    protected String description;
    protected nameUpgradeEnum nameCode; //Used to identify easily the type of object
    protected String name;


    //public abstract void effect(CurrentGameState cg);

    public String getDescription() {
        return description;
    }
    public nameUpgradeEnum getNameCode() {
        return nameCode;
    }
}
