package model.beast;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import model.Dice;
import java.io.Serializable;

@JsonIgnoreProperties ({"currentEchos","nameBeasts"})
public abstract class Beast implements Serializable {

    protected String englishName;
    protected String[] otherNameLanguage;

    protected String englishDescription;
    protected String [] otherLanguageDescription;

    protected NameBeastsEnum nameBeast;
    protected int baseBloodEchos;
    protected Dice dice;
    protected int[] trophy;

    protected int currentEchos;


    public void updateCurrentEchos(int currentEchos) {
        this.currentEchos = currentEchos;
    }

    public String getEnglishName() {
        return englishName;
    }
    public String[] getOtherNameLanguage() {
        return otherNameLanguage;
    }
    public String[] getOtherLanguageDescription() {
        return otherLanguageDescription;
    }
    public String getEnglishDescription() {
        return englishDescription;
    }
    public Dice getDice() {
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
