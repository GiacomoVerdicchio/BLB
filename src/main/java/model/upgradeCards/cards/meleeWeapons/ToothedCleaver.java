package model.upgradeCards.cards.meleeWeapons;

import com.fasterxml.jackson.databind.ObjectMapper;
import model.upgradeCards.UpgradeCard;
import model.upgradeCards.nameUpgradeEnum;

import java.io.File;
import java.io.IOException;

public class ToothedCleaver extends UpgradeCard {

    private int damage;

    public void populating()
    {
        try {
            ObjectMapper mapper = new ObjectMapper();

            String path="src/main/resources/meleeWeapons/ToothedCleaver.json";
            ToothedCleaver ToothedCleaver = mapper.readValue(new File(path),ToothedCleaver.class);

            this.name = ToothedCleaver.getName();
            this.nameCode= ToothedCleaver.getNameCode();
            this.description=ToothedCleaver.getDescription();
            this.damage=ToothedCleaver.getDamage();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public int getDamage() {return damage;}
}
