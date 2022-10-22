package model.upgradeCards;

import org.junit.Test;

public class CardCreatorTest {

    @Test
    public void Test()
    {
        UpgradeCard card=CardCreator.getRightCard(NameUpgradeEnum.ToothedCleaver);
        System.out.println(card.getNameCode());
    }
}
