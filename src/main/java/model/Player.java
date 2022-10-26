package model;

import model.upgradeCards.HandDeck;
import model.upgradeCards.DiscardDeck;
import model.upgradeCards.UpgradeCard;

import java.util.ArrayList;

public class Player {
    private PointBoard pointBoard;
    private DiscardDeck discardDeck;
    private HandDeck handDeck;
    private boolean firstPlayer;
    private ArrayList<UpgradeCard> playedCard;
    private String name;

    private int life;

    public Player(String name,int maxHealth)
    {
        firstPlayer=false;
        life=maxHealth;
        pointBoard=new PointBoard();
        discardDeck=new DiscardDeck();
        handDeck=new HandDeck();
        playedCard=new ArrayList<>();
        this.name=name;
        firstPlayer=false;
    }


    public void updateFirstPlayer(boolean b){firstPlayer=b;}
    public void takeDemage(int damage)
    {
        life-=damage;
    }
    public void restoreLife(int maxLife)
    {
        life=maxLife;
    }
    public void healing(int heal){life+=heal;}
    public void pickActivatedCard(UpgradeCard upgradeCard){
        playedCard.add(upgradeCard);
        handDeck.removeFromDeck(upgradeCard);
    }
    public void pickActivatedCard(int index)
    {
        playedCard.add(handDeck.getDeck().get(index));
        handDeck.removeFromDeck(index);
    }

    public PointBoard getPointBoard() {
        return pointBoard;
    }
    public DiscardDeck getCimiteryDeck() {
        return discardDeck;
    }
    public HandDeck getHandDeck() {
        return handDeck;
    }
    public ArrayList<UpgradeCard> getPlayedCard() {
        return playedCard;
    }
    public String getName() {
        return name;
    }
    public boolean getFirstPlayer() {
        return firstPlayer;
    }
}
