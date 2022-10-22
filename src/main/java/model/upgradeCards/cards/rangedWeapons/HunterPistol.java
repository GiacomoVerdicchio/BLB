package model.upgradeCards.cards.rangedWeapons;

import com.fasterxml.jackson.databind.ObjectMapper;
import model.upgradeCards.UpgradeCard;

import java.io.File;
import java.io.IOException;
import java.io.Serializable;

public class HunterPistol extends RangedWeapons implements Serializable {
    private int damage;

    public void populating()
    {
        try {
            ObjectMapper mapper = new ObjectMapper();

            String path="src/main/resources/RangedWeapons/HunterPistol.json";
            HunterPistol hunterPistol = mapper.readValue(new File(path),HunterPistol.class);

            super.name = hunterPistol.getName();
            super.nameCode= hunterPistol.getNameCode();
            super.description=hunterPistol.getDescription();
            this.damage=hunterPistol.getDamage();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public int getDamage() {return damage;}

}
