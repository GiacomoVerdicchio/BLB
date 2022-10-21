package model.upgradeCards.cards.meleeWeapons;

import java.io.*;
import com.fasterxml.jackson.databind.ObjectMapper;
import model.upgradeCards.UpgradeCard;

public class HunterAxe extends UpgradeCard {

    private int damage;

    public void populating()
    {
        try {
            ObjectMapper mapper = new ObjectMapper();

            String path="src/main/resources/meleeWeapons/HunterAxe.json";
            HunterAxe hunterAxeTemp = mapper.readValue(new File(path),HunterAxe.class);

            this.name = hunterAxeTemp.getName();
            this.nameCode= hunterAxeTemp.getNameCode();
            this.description=hunterAxeTemp.getDescription();
            this.damage=hunterAxeTemp.getDamage();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public int getDamage() {return damage;}
}

