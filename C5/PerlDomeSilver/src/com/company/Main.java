package com.company;

public class Main
{
    public static void main(String[] args)
    {
        String selection;
        boolean runProgram = true;
        displayMenu();
        int totalCounter = 0;
        int wTotal = 0;
        int hTotal = 0;
        int gTotal = 0;
        int pTotal = 0;

        do
        {
            selection = menuSelection();
            displayMenu();
            if (selection == "X")
            {
                System.out.println("Invalid selection. Try that again correctly or it's off to the Perl Dome with You.");
                selection = menuSelection();
                if (selection == "X")
                {
                    System.out.println("You were warned. Off to the Perl Dome with you");
                    displayMenu();
                }
                else
                {

                }
            }
            else
            {

            }
        } while (runProgram = true);

    }


    private static void displayMenu()
    {
        System.out.println("(W) Wasteland Wombat Womps");
        System.out.println("(H) Hero not Needed Wafers");
        System.out.println("(G) Gas Running Out Energy Bar");
        System.out.println("(P) Pig Parts Paradise");
        System.out.println();
        System.out.println("Please make a selection");
    }

    private static String menuSelection()
    {
        java.util.Scanner input = new java.util.Scanner(System.in);
        String selection = input.nextLine();
        switch (selection)
        {
            case "W":
            case "w":
                System.out.println("Here is your package of Wasteland Wombat Womps");
                return "W";

            case "H":
            case "h":
                System.out.println("Here is your package of Hero Not Needed Wafers");
                return "H";


            case "G":
            case "g":
                System.out.println("Here is your package of Gas Running Out Energy Bar");
                return "G";


            case "P":
            case "p":
                System.out.println("Here is your package of Pig Parts Paradise");
                return "P";


            default:
                return "X";

        }
    }
    private static String menuSelection
}

