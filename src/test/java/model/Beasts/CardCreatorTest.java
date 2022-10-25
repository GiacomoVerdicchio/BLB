package model.Beasts;

import model.beast.Beast;
import model.beast.CreatorBeasts;
import model.beast.NameBeastsEnum;
import org.junit.Test;

public class CardCreatorTest {


    @Test
    public void testCreation()
    {
        //Beast normalBeast= CreatorBeasts.getRightCard(NameBeastsEnum.bloodyCrowOfCainhurst);
        //System.out.println(normalBeast.getNameBeastsEnum());
        Beast witch= CreatorBeasts.getRightCard(NameBeastsEnum.TheWitchOfHemwick);
        System.out.println(witch.getNameBeastsEnum());
    }
}
