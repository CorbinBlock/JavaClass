package com.company;

public class Main
{

    public static void main(String[] args)
    {
        int positiveInt = 2147483647;
        System.out.println("What is value of positiveInt? " + positiveInt);
        positiveInt++;
        System.out.println("Incremented by one: " + positiveInt);
        int negativeInt = -2147483648;
        System.out.println("What is the value of negativeInt? " + negativeInt);
        negativeInt--;
        System.out.println("Decremeneted by one: " + negativeInt);
    }
}
