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

        //Trying all the functioning of firstPlayer
        cgs.addPlayers(names.get(1));
        cgs.addPlayers(names.get(2));
        cgs.updateFirstPlayerForAll();
        assertEquals(1,cgs.getIndexFirstPlayer());
        cgs.updateFirstPlayerForAll();
        assertEquals(2,cgs.getIndexFirstPlayer());
        cgs.updateFirstPlayerForAll();
        assertEquals(0,cgs.getIndexFirstPlayer());
        cgs.updateFirstPlayerForAll();
        assertEquals(1,cgs.getIndexFirstPlayer());

        //In case of Amelia
        cgs =new CurrentGameState();
        cgs.updateMaxHealth(6);

        assertEquals(6,cgs.getMaxHealth());
    }
}
