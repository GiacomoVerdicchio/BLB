package model.upgradeCards;

import java.io.Serializable;

public abstract class UpgradeCard implements Serializable
{
    protected String englishName;
    protected String italianName;
    protected String englishDescription;
    protected String italianDescription;

    protected NameUpgradeEnum nameCode; //Used to identify easily the type of object

    //public abstract void effect(CurrentGameState cg);

    public String getEnglishDescription() {
        return englishDescription;
    }
    public String getItalianDescription() {
        return italianDescription;
    }
    public NameUpgradeEnum getNameCode() {
        return nameCode;
    }
    public String getEnglishName() { return englishName; }
    public String getItalianName() { return italianName; }
}
