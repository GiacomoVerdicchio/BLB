package model.upgradeCards;

import org.junit.Test;

public class CreatorUpgradeCardTest {

    @Test
    public void Test()
    {
        UpgradeCard card= CreatorUpgradeCard.getRightCard(NameUpgradeCardEnum.SawCleaver);
        //System.out.println(card.getNameCode());
    }
}
