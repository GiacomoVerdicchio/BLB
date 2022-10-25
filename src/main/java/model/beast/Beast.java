package model.beast;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;

@JsonIgnoreProperties ({"currentEchos"})
public abstract class Beast implements Serializable {

    protected String[] name;
    protected String [] description;

    protected NameBeastsEnum nameBeast;
    protected int baseBloodEchos;
    protected int dice;
    protected int[] trophy;

    protected int currentEchos;


    public void updateCurrentEchos(int currentEchos) {
        this.currentEchos = currentEchos;
    }

    public String[] getName() {
        return name;
    }
    public String[] getDescription() {
        return description;
    }

    public int getDice() {
        return dice;
    }
    public int[] getTrophy() {
        return trophy;
    }
    public int getBaseBloodEchos() {
        return baseBloodEchos;
    }
    public NameBeastsEnum getNameBeastsEnum() {
        return nameBeast;
    }
    public int getCurrentEchos() {
        return currentEchos;
    }
}
