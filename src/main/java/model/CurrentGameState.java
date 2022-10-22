package model;

import model.upgradeCards.UpgradeDeck;

import java.util.ArrayList;

public class CurrentGameState {
    private Dice[] dices;
    private ArrayList<Player> players;
    private UpgradeDeck upgradeDeck;
    private static int maxHealth;

    //TODO testare uso corretto dices, aggiungere scelta mostri e relative strutture dati
    public CurrentGameState(int playerNum)
    {
        maxHealth=8;
        dices=new Dice[3];
        dices[0]=new Dice(0,0,1,1,2,2,false,false,false,true,true,false);
        dices[1]=new Dice(0,1,2,2,3,3,false,false,true,true,true,false);
        dices[2]=new Dice(0,1,2,3,3,3,false,false,false,true,true,false);

        for(int i=0;i<playerNum;i++)
            players.add(new Player());

        players.get(0).updateFirstPlayer(true);
        upgradeDeck=new UpgradeDeck();

    }

    public static int getMaxHealth() {
        return maxHealth;
    }
    public static void updateMaxHealth(int maxHealth) {
        CurrentGameState.maxHealth = maxHealth;
    }

    public void addPlayers(Player player)
    {
        this.players.add(player);
    }
}
