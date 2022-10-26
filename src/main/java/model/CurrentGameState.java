package model;

import model.beast.BeastsDeck;
import model.upgradeCards.UpgradeDeck;

import java.util.ArrayList;

public class CurrentGameState {
    private Dice[] dices;
    private ArrayList<Player> players;
    private int numOfPlayers;
    private UpgradeDeck upgradeDeck;
    private BeastsDeck beastsDeck;
    private int maxHealth;
    private int indexFirstPlayer;

    //TODO testare uso corretto dices, aggiungere scelta mostri e relative strutture dati
    public CurrentGameState()
    {
        maxHealth=8;
        dices=new Dice[3];
        dices[0]=new Dice(0,0,1,1,2,2,false,false,false,true,true,false);
        dices[1]=new Dice(0,1,2,2,3,3,false,false,true,true,true,false);
        dices[2]=new Dice(0,1,2,3,3,3,false,false,false,true,true,false);

        indexFirstPlayer =0;
        numOfPlayers=0;
        upgradeDeck=new UpgradeDeck();
        beastsDeck = new BeastsDeck();
        players=new ArrayList<>();
    }


    public void updateFirstPlayerForAll()
    {
        players.get(indexFirstPlayer).updateFirstPlayer(false);
        players.get( (indexFirstPlayer +1) % numOfPlayers).updateFirstPlayer(true);
        indexFirstPlayer=(indexFirstPlayer+1)% numOfPlayers;
    }

    public void updateMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
    }
    public void addPlayers(Player player)
    {
        this.players.add(player);
        numOfPlayers=players.size();
        //Updato first player solo se non è già stato updatato e se ho inserito abbastanza giocatori da averlo
        if(players.size()>indexFirstPlayer && !players.get(indexFirstPlayer).getFirstPlayer())
            players.get(indexFirstPlayer).updateFirstPlayer(true);
    }
    public void addPlayers(String player)
    {
        Player player1=new Player(player,maxHealth);
        this.players.add(player1);
        numOfPlayers=players.size();
        //Updato first player solo se non è già stato updatato e se ho inserito abbastanza giocatori da averlo
        if(players.size()>indexFirstPlayer && !players.get(indexFirstPlayer).getFirstPlayer())
            players.get(indexFirstPlayer).updateFirstPlayer(true);
    }


    public int getMaxHealth() { return maxHealth; }
    public int getIndexFirstPlayer(){return indexFirstPlayer;}
    public UpgradeDeck getUpgradeDeck() { return upgradeDeck; }
    public BeastsDeck getBeastsDeck() { return beastsDeck; }
}
