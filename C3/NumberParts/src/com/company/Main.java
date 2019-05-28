package com.company;

public class Main
{

    public static void main(String[] args)
    {
        double number = 3.75;
        double fraction = number % 1;
        double whole = number - fraction;
        System.out.println("Whole part: " + whole);
        System.out.println("Fractional part: " + fraction);

    }
}
