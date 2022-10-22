package model.upgradeCards;

public abstract class UpgradeCard {

    protected String description;
    protected NameUpgradeEnum nameCode; //Used to identify easily the type of object
    protected String name;
    public static final int numberOfWeapons=5;
    public static final int numberOfRangedWeapons=1;
    public static final int numberOfMeleeWeapons=2;
    public static final int numberOfUtilityCards=2;

    //public abstract void effect(CurrentGameState cg);

    public String getDescription() {
        return description;
    }
    public NameUpgradeEnum getNameCode() {
        return nameCode;
    }
    public String getName() { return name; }
}
