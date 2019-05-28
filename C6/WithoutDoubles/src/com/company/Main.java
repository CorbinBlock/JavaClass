package com.company;

public class Main
{

    public static void main(String[] args)
    {
        System.out.println(withoutDoubles(2, 3, true));
        System.out.println(withDoubles(2));
    }
    public static int withoutDoubles(int die1, int die2, boolean noDoubles)
    {
        java.util.Random random = new java.util.Random();
        die1 = random.nextInt(6) + 1;
        die2 = random.nextInt(6) + 1;
        if(die1 == die2 && noDoubles == true)
        {
            return withDoubles(die1) + die2;
        }
        else
        {
            return die1 + die2;
        }

    }
    private static int withDoubles(int die1)
    {
        if(die1 < 6)
        {
            return 1;
        }
        else
        {
            return die1++;
        }
    }
}
