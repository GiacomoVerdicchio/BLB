package model;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PointBoardTest {
    PointBoard pt;

    @Test
    public void testPt()
    {
        pt=new PointBoard();
        assertEquals(0,pt.getBankedEcho());
        assertEquals(0,pt.getCollectedEcho());
        assertEquals(0,pt.getTrophiesBoard()[0][0]);
        assertEquals(5,pt.getTrophiesBoard()[1][4]);
        assertEquals(8,pt.getTrophiesBoard()[2][5]);
        assertEquals(0,pt.getTrophiesIndexToken()[0]);
        assertEquals(0,pt.getTrophiesIndexToken()[1]);
        assertEquals(0,pt.getTrophiesIndexToken()[2]);



        //Verifying trophies
        pt.goOnWithTrophy(0);
        assertEquals(1,pt.getTrophiesIndexToken()[0]);
        pt.goOnWithTrophy(0);
        pt.goOnWithTrophy(0);
        assertEquals(3,pt.getTrophiesIndexToken()[0]);
        assertEquals(3,pt.calculatePointRow(0));
        pt.goOnWithTrophy(0);
        assertEquals(4,pt.getTrophiesIndexToken()[0]);
        assertEquals(5,pt.calculatePointRow(0));
        pt.goOnWithTrophy(0);
        assertEquals(5,pt.getTrophiesIndexToken()[0]);
        assertEquals(8,pt.calculatePointRow(0));

        pt.goOnWithTrophy(1);
        assertEquals(1,pt.getTrophiesIndexToken()[1]);
        assertEquals(1,pt.calculatePointRow(1));
        pt.goOnWithTrophy(1);
        assertEquals(2,pt.getTrophiesIndexToken()[1]);
        assertEquals(2,pt.calculatePointRow(1));
        pt.goOnWithTrophy(1);
        pt.goOnWithTrophy(1);
        assertEquals(4,pt.getTrophiesIndexToken()[1]);
        assertEquals(5,pt.calculatePointRow(1));
    }

    @Test
    public void testEchos() {
        pt=new PointBoard();
        pt.addCollectedEchos(4);
        assertEquals(4,pt.getCollectedEcho());

        pt.addBankedEchos(1);
        assertEquals(1,pt.getBankedEcho());

        //Hunter dream
        pt.storeCollectedEchosToBank();
        assertEquals(0,pt.getCollectedEcho());
        assertEquals(5,pt.getBankedEcho());

        //death
        pt.addCollectedEchos(4);
        assertEquals(4,pt.getCollectedEcho());
        pt.resetCollectedEchos();
        assertEquals(0,pt.getCollectedEcho());
        assertEquals(5,pt.getBankedEcho());
    }

}

