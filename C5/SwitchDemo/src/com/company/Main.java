package com.company;

public class Main
{
    public static void main(String[] args)
    {
        java.util.Scanner input = new java.util.Scanner(System.in);

        boolean keepRunning = true;

        do
        {
            System.out.println("What direction to go? (X to end)");
            String direction = input.next();

            switch(direction)
            {
                case "N":
                case "n":
                    goNorth();
                    break;
                case "S":
                case "s":
                    System.out.println("Going South");
                    break;
                case "E":
                case "e":
                    System.out.println("Going East");
                    break;
                case "X":
                case "x":
                    keepRunning = false;
                    break;
                default:
                    System.out.println("I'm sorry Dave, I can't do that.");
            }


        } while(keepRunning);

        System.out.println("See ya");
    }

    private static void goNorth()
    {
        System.out.println("I'm having a great time going North.");
        System.out.println("Hello");
    }
}
