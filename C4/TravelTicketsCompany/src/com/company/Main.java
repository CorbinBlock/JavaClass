package com.company;

public class Main
{

    public static void main(String[] args)
    {
        java.util.Scanner userinput = new java.util.Scanner(System.in);  //java.util.Scanner is a class
        System.out.println("Enter your ticket number");
        int ticketNumber = userinput.nextInt();
        int lastDigit = ticketNumber % 10;
        int ticketPrefix = ticketNumber - lastDigit;
        int divSeven = ticketPrefix % 7;
        boolean test = lastDigit == divSeven;
        if (test)
        {
            System.out.println("Good number");
        }
        else
        {
            System.out.println("Bad number");
        }
        System.out.println(ticketPrefix);
        System.out.println(lastDigit);
        System.out.println(divSeven);

    }
}
