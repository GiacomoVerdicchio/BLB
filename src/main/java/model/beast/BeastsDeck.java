package model.beast;
import java.util.Collections;
import java.util.Random;
import java.util.ArrayList;

public class BeastsDeck {
    private ArrayList<Beast> beastsDeck;
    private FinalBoss finalBoss;

    public BeastsDeck()
    {
        beastsDeck =new ArrayList<>();

        ArrayList<Beast> normalBeasts1=constructNormalPartOfDeck(7,13,0);
        ArrayList<Beast> bosses=constructNormalPartOfDeck(3,20,14);
        ArrayList<Beast> finalBeast=constructNormalPartOfDeck(1,25,22);

        for(int i=0;i<7;i++)
        {
            beastsDeck.add(normalBeasts1.get(i));
        }
        for(int i=0;i<3;i++)
        {
            beastsDeck.add(bosses.get(i));
        }
        beastsDeck.add(finalBeast.get(0));

        finalBoss= (FinalBoss) beastsDeck.get(10);
        beastsDeck.remove(10);

        Collections.shuffle(beastsDeck);
        System.out.println("fiasd");
    }


    private ArrayList<Beast> constructNormalPartOfDeck(int maxNumDeck, int maxRand, int minRand)
    {
        ArrayList<Beast> deck=new ArrayList<>();
        int randomNum;
        boolean find;
        Random rand = new Random();

        while(deck.size()<maxNumDeck)
        {
            randomNum= rand.nextInt(maxRand-minRand+1) + minRand ;
            Beast normalBeast=CreatorBeasts.getRightCard(    NameBeastsEnum.values()[randomNum]   );

            find=false;
            for(int i = 0; i< deck.size() && !find; i++)
            {
                if(normalBeast.getNameBeastsEnum()==deck.get(i).getNameBeastsEnum())
                    find=true;
            }
            if(!find)
                deck.add(normalBeast);

        }
        return deck;
    }

    public ArrayList<Beast> getBeastsDeck()
    {
        return beastsDeck;
    }
    public FinalBoss getFinalBoss() {
        return finalBoss;
    }
}
