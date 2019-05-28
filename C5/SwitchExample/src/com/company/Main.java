package com.company;

public class Main
{

    public static void main(String[] args)
    {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.println("What is your last name? ");
        String lastName = input.next();
        switch (lastName)
        {
            case "Jones":
            case "Smith":
                System.out.println("Grand Winner!");
                break;
            case "Lazenby":
                System.out.println("Hey, he owes me dinner.");
                break;
            default:
                System.out.println("Sorry, not a winner");

        }
    }
}
