package com.company;

public class Main
{
    public static void main(String[] args)
    {
        printRandomNumber(1, 5);     //return random value from a set of x possible values.

        int count = 0;

        while (count < 100)
        {
            printRandomNumber(3, 10);
            count++;
        }

    }

    private static void printRandomNumber(int min, int max)  //method signature
    {
        java.util.Random random = new java.util.Random();
        int number = random.nextInt(max - min + 1);
        number = number + min;
        System.out.println(number);
    }
}