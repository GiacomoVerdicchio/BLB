package model;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class CurrentGameStateTest {
    CurrentGameState cgs;

    @Test
    public void testConstruct()
    {
        ArrayList<String> names=new ArrayList<String>();
        names.add("James");names.add("Pippo");names.add("Pluto");


        cgs =new CurrentGameState();
        cgs.addPlayers(names.get(0));
        assertEquals(5,cgs.getUpgradeDeck().getUpgradeDeck().size());

        //In case of Amelia
        cgs =new CurrentGameState();
        cgs.updateMaxHealth(6);

        assertEquals(6,cgs.getMaxHealth());
    }
}
