package model.Beasts;

import model.beast.BeastsDeck;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BeastDeckTest {

    @Test
    public void testConstr()
    {
        BeastsDeck bd;
        bd=new BeastsDeck();
        assertEquals(10,bd.getBeastsDeck().size());

        /*STAMPA
        for(int i=0;i<bd.getBeastsDeck().size();i++)
            System.out.println("Beast:   "+bd.getBeastsDeck().get(i));

         */
    }
}
