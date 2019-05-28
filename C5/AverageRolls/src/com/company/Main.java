package com.company;

public class Main
{

    public static void main(String[] args)
    {
        printTotalRolls(1);
        printTotalRolls(10);
        printTotalRolls(100);
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
        System.out.println("Average across all rolls: " + (double)total / (double)count );
    }
}
