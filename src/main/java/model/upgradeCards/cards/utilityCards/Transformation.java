package model.upgradeCards.cards.utilityCards;

import com.fasterxml.jackson.databind.ObjectMapper;
import model.upgradeCards.UpgradeCard;

import java.io.File;
import java.io.IOException;
import java.io.Serializable;

public class Transformation extends UtilityCards implements Serializable  {

    public void populating()
    {
        try {
            ObjectMapper mapper = new ObjectMapper();

            String path="src/main/resources/UtilityCards/Transformation.json";
            Transformation transformation = mapper.readValue(new File(path),Transformation.class);

            super.name = transformation.getName();
            super.nameCode= transformation.getNameCode();
            super.description=transformation.getDescription();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
