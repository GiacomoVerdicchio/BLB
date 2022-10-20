package model;

import java.util.concurrent.ThreadLocalRandom;

public class Dice {
    private int[] values;
    private boolean[] plus;

    public Dice(int a, int b, int c, int d, int e, int f, boolean b1, boolean b2,boolean b3, boolean b4, boolean b5,boolean b6)
    {
        values=new int[6];
        values[0]=a;
        values[1]=b;
        values[2]=c;
        values[3]=d;
        values[4]=e;
        values[5]=f;

        plus=new boolean[6];
        plus[0]=b1;
        plus[1]=b2;
        plus[2]=b3;
        plus[3]=b4;
        plus[4]=b5;
        plus[5]=b6;
    }

    //return the index of the roll in this dice
    public int rollDice()
    {
        /*Questa sarà la logica di reroll, ma per ora faccio a roll singolo
        int index=0;
        int somma=0;
        do {
             index= (int) (Math.random() * 100);
             somma+= values[index];
        }while(plus[index]);
        */

        return ThreadLocalRandom.current().nextInt(0, 5 + 1);
    }

    public int[] getValues() {
        return values;
    }
    public boolean[] getPlus()
    {
        return plus;
    }
}
