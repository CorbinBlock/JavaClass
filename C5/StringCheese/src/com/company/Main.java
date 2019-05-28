package com.company;

public class Main
{

    public static void main(String[] args)
    {
        java.util.Scanner input = new java.util.Scanner(System.in);
        int cheeseSize;
        int cheeseDiameter;
        int price;
        boolean programRun = true;
        do
        {
            do
            {
                cheeseDiameter = evaluateCheeseDiameter();
            } while (cheeseDiameter == 0);
            do
            {
                cheeseSize = evaluateCheeseSize();
            } while (cheeseSize == 0);
            price = calculateOrder(cheeseSize, cheeseDiameter);

            System.out.println("You current price is: " + price);
        } while (programRun);
    }


    private static int calculateOrder(int cheeseSize, int cheeseDiameter)
    {
        int price = 0;
        switch (cheeseDiameter)
        {
            case 1:
                if (cheeseSize > 50)
                {
                    price = 2 * cheeseSize + 5;
                    return price;
                }
                else
                {
                    price = (2 * cheeseSize) + (2 * cheeseSize) + 5;
                    return price;
                }
            case 2:
                if (cheeseSize > 75)
                {
                    price = (4 * cheeseSize) + 5;
                    return price;

                }
                else
                {
                    price = (4 * cheeseSize) + (2 * cheeseSize) + 5;
                    return price;

                }
            case 3:
            {
                if (cheeseSize > 25)
                {
                    price = (6 * cheeseSize) + 5;
                    return price;

                }
                else
                {
                    price = (6 * cheeseSize) + (4 * cheeseSize) + 5;
                    return price;
                }

            }
            default:
                System.out.println("That order is too crazy.");
                return price; //this switch will never be default

        }
    }

    private static int evaluateCheeseDiameter()
    {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.println("What diameter cheese do you want? Please enter 1, 2 or 3 (in inches).");
        int cheeseDiameter = input.nextInt();
        switch (cheeseDiameter)
        {

            case 1:
                cheeseDiameter = 1;
                return cheeseDiameter;
            case 2:
                cheeseDiameter = 2;
                return cheeseDiameter;
            case 3:
                cheeseDiameter = 3;
                return cheeseDiameter;
            default:
                System.out.println("This order is too crazy!");
                return 0;
        }
    }

    private static int evaluateCheeseSize()
    {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.println("What size cheese do you want? (in yards)");
        int cheeseSize = input.nextInt();
        if (cheeseSize < 0)
        {
            System.out.println("This order is too crazy!");
            return 0;
        }
        else
        {
            return cheeseSize;
        }

    }
}

