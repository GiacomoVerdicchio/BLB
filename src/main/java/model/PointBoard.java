package model;

public class PointBoard {
    private int collectedEcho;
    private int bankedEcho;

    private final int[][] trophiesBoard;

    //trophieToken avrà per esempio 0,1,4 dove il 4 indica la posizione nell'array (cioè 0pt,1pt,5pt)
    private int[] trophiesIndexToken;

    public PointBoard() {
        collectedEcho = 0;
        bankedEcho = 0;
        trophiesBoard = new int[3][6];
        trophiesIndexToken = new int[3];
        for (int i = 0; i < 3; i++) {
            trophiesBoard[i][0] = 0;
            trophiesBoard[i][1] = 1;
            trophiesBoard[i][2] = 2;
            trophiesBoard[i][3] = 3;
            trophiesBoard[i][4] = 5;
            trophiesBoard[i][5] = 8;
        }
    }

    /**
     * This function take the type of trophie to increase and add a 1 to the trophiesToken
     *
     * @param trophyType is the row of the trophiesBoard that must be increased
     */
    public void goOnWithTrophy(int trophyType) {
        trophiesIndexToken[trophyType] += 1;
    }


    //occhio che non devo andare sotto 0
    public void storeCollectedEchosToBank() {
        bankedEcho += collectedEcho;
        collectedEcho = 0;
    }

    public void resetCollectedEchos() {
        collectedEcho = 0;
    }

    //occhio che gli add devono essere sempre positivi
    public void addCollectedEchos(int echosToAdd) {
        collectedEcho += echosToAdd;
    }

    public void addBankedEchos(int echosToAdd) {
        bankedEcho += echosToAdd;
    }

    public int calculatePointRow(int row) {
        int tempColumnIndex= trophiesIndexToken[row];
        return trophiesBoard[row][tempColumnIndex];}


    public int getCollectedEcho() {
        return collectedEcho;
    }
    public int getBankedEcho() {
        return bankedEcho;
    }
    public int[] getTrophiesIndexToken() {
        return trophiesIndexToken;
    }
    public int[][] getTrophiesBoard() {
        return trophiesBoard;
    }

}
