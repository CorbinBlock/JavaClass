package com.company;

public class Main
{

    public static void main(String[] args)
    {
        printTotalRolls(2);
    }

    private static void printTotalRolls(int rolls)
    {
        java.util.Random random = new java.util.Random();
        int count = 0;
        int total = 0;

        while (count < rolls)
        {
            int roll = random.nextInt(20) + 1;
            total = total + roll;
            count++;
        }
        System.out.println("Total across all rolls: " + total);
    }
}
