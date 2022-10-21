package model.upgradeCards.cards.meleeWeapons;

import java.io.*;


import com.fasterxml.jackson.databind.ObjectMapper;
import model.upgradeCards.UpgradeCard;

public class HunterAxe extends UpgradeCard {

    public void populatingHuntAxe()
    {
        try {
            ObjectMapper mapper = new ObjectMapper();
            String path="C:/Users/giaco/OneDrive/Desktop/Pc e Informatica 2/Bloodborne/src/main/resources/model/upgradeCards/meleeWeapon/HunterAxe.json";
            HunterAxe hunterAxe = mapper.readValue(new File(path),HunterAxe.class);
            this.name=hunterAxe.name;

        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }

    }
}

