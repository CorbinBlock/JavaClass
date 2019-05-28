package com.company;

public class Main
{

    public static void main(String[] args)
    {
        int count = 0;
        do
        {
            printTotalRolls();
            count++;
        } while (count < 10);

        System.out.println();

    }

    private static void printTotalRolls()
    {
        java.util.Random random = new java.util.Random();

        int rolls = random.nextInt(20) + 1;
        int rollsSum =+ rolls;

        System.out.println(rolls);
        System.out.println(rollsSum);


    }
}
