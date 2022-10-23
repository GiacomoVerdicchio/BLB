package model.upgradeCards;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;

public abstract class UpgradeCard implements Serializable
{
    protected String EnglishName;
    protected String ItalianName;
    protected String EnglishDescription;
    protected String ItalianDescription;

    protected NameUpgradeEnum nameCode; //Used to identify easily the type of object

    //public abstract void effect(CurrentGameState cg);

    public String getEnglishDescription() {
        return EnglishDescription;
    }
    public String getItalianDescription() {
        return ItalianDescription;
    }
    public NameUpgradeEnum getNameCode() {
        return nameCode;
    }
    public String getEnglishName() { return EnglishName; }
    public String getItalianName() { return ItalianName; }
}
