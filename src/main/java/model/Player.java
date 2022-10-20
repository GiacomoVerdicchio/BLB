package model;

public class Player {
    private PointBoard pointBoard;
    private CimiteryDeck cimiteryDeck;
    private HandDeck handDeck;

    private int life;

    public Player()
    {
        life=0;
    }


    public PointBoard getPointBoard() {
        return pointBoard;
    }
    public CimiteryDeck getCimiteryDeck() {
        return cimiteryDeck;
    }
    public HandDeck getHandDeck() {
        return handDeck;
    }
}
