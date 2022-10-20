package model;

import model.upgradeCards.HandDeck;
import model.upgradeCards.DiscardDeck;

public class Player {
    private PointBoard pointBoard;
    private DiscardDeck discardDeck;
    private HandDeck handDeck;

    private int life;

    public Player()
    {
        life=0;
        pointBoard=new PointBoard();
        discardDeck=new DiscardDeck();
        //handDeck=new HandDeck();
    }



    public void takeDemage(int damage)
    {
        life-=damage;
    }
    public void restoreLife(int maxLife)
    {
        life=maxLife;
    }
    public void healing(int heal){life+=heal;}

    public PointBoard getPointBoard() {
        return pointBoard;
    }
    public DiscardDeck getCimiteryDeck() {
        return discardDeck;
    }
    public HandDeck getHandDeck() {
        return handDeck;
    }
}
