package model.upgradeCards.cards.meleeWeapons;

import java.io.*;
import com.fasterxml.jackson.databind.ObjectMapper;
import model.upgradeCards.UpgradeCard;

public class HunterAxe extends UpgradeCard {

    private int damage;

    public HunterAxe() {}

    public void populatingHuntAxe()
    {
        try {
            ObjectMapper mapper = new ObjectMapper();
            String path="src/main/resources/model/upgradeCards/cards/meleeWeapon/HunterAxe.json";
            HunterAxe hunterAxeTemp = mapper.readValue(new File(path),HunterAxe.class);

            this.name = hunterAxeTemp.name;
            this.nameCode= hunterAxeTemp.nameCode;
            this.description=hunterAxeTemp.description;
            this.damage=hunterAxeTemp.damage;

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}

