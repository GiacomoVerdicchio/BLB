package model.upgradeCards;

import java.io.Serializable;

public abstract class UpgradeCard implements Serializable
{
    protected String[] name;
    //TODO andrà modificata in un vettore di stringhe chiamato other language
    protected String[] description;

    protected NameUpgradeCardEnum nameCode; //Used to identify easily the type of object

    public String[] getDescription() {
        return description;
    }
    public NameUpgradeCardEnum getNameCode() {
        return nameCode;
    }
    public String[] getName() { return name; }
}
