package com.company;

public class Main
{
    public static void main(String[] args)
    {
        printRandomNumber(1);     //return random value from a set of x possible values.
        printRandomNumber(5);
        printRandomNumber(10);

    }

    private static void printRandomNumber(int max)  //method signature
    {
        java.util.Random random = new java.util.Random();
        int number = random.nextInt(max);
        number++;
        System.out.println(number);
    }
}