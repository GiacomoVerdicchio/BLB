package model.beast;
import java.util.Random;
import java.util.ArrayList;

public class BeastsDeck {
    private ArrayList<Beast> beastsDeck;
    public BeastsDeck()
    {
        beastsDeck =new ArrayList<>();

        ArrayList<Beast> normalBeasts1=constructNormalPartOfDeck();
        beastsDeck.add(normalBeasts1.get(0));
        beastsDeck.add(normalBeasts1.get(1));
        beastsDeck.add(normalBeasts1.get(2));
        beastsDeck.add(normalBeasts1.get(3));
        beastsDeck.add(normalBeasts1.get(4));
        beastsDeck.add(normalBeasts1.get(5));
        beastsDeck.add(normalBeasts1.get(6));

        //TODO vedere se funziona tutto tramite testing

    }
    private ArrayList<Beast> constructNormalPartOfDeck()
    {
        ArrayList<Beast> normalBeastDeck=new ArrayList<>();
        int randomNum;
        boolean find;
        Random rand = new Random();
        while(normalBeastDeck.size()<7)
        {
            randomNum= rand.nextInt(CreatorBeasts.numNormalBeasts);
            Beast normalBeast=CreatorBeasts.getRightCard(    NameBeastsEnum.values()[randomNum]   );

            find=false;
            for(int i=0;i< normalBeastDeck.size() && find==false;i++)
            {
                if(normalBeast.getNameBeastsEnum()==normalBeastDeck.get(i).getNameBeastsEnum())
                    find=true;
            }
            if(find==false)
                normalBeastDeck.add(normalBeast);

        }
        return normalBeastDeck;
    }

    public ArrayList<Beast> getBeastsDeck()
    {
        return beastsDeck;
    }
}
