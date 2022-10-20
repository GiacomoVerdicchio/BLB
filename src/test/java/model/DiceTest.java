package model;

import org.junit.jupiter.api.Test;

public class DiceTest {
    Dice d;

    public void constructDice1()
    {
        d=new Dice(0,0,1,1,2,2,false,false,true,false,false,true);
    }

    @Test
    public void testDice1()
    {
        constructDice1();
        System.out.println("\n"+d.rollDice());
    }
}
