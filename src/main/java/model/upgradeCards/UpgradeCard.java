package model.upgradeCards;

import java.io.Serializable;

public abstract class UpgradeCard implements Serializable
{
    protected String englishName;
    //TODO andrà modificata in un vettore di stringhe chiamato other language
    protected String italianName;
    protected String englishDescription;
    protected String italianDescription;

    protected NameUpgradeCardEnum nameCode; //Used to identify easily the type of object

    //public abstract void effect(CurrentGameState cg);

    public String getEnglishDescription() {
        return englishDescription;
    }
    public String getItalianDescription() {
        return italianDescription;
    }
    public NameUpgradeCardEnum getNameCode() {
        return nameCode;
    }
    public String getEnglishName() { return englishName; }
    public String getItalianName() { return italianName; }
}
