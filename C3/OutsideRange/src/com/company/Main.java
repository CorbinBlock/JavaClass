package com.company;

public class Main
{

    public static void main(String[] args)
    {
        int x = 5;
        int upperLimit = 11;
        int lowerLimit = 0;
        boolean limit = x < 0 || x > 11;
        System.out.println("Is X not between 0 and 11 inclusive? " + limit);
    }
}
