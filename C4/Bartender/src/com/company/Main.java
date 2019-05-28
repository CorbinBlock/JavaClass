package com.company;

public class Main
{

    public static void main(String[] args)
    {
        java.util.Scanner userinput = new java.util.Scanner(System.in);  //java.util.Scanner is a class
        System.out.println("Do you prefer: (1)- Water (2) - Cola (3) - Glen Rio Ale");
        int drinkChoice = userinput.nextInt();
        boolean isWater = drinkChoice == 1;
        boolean isCola = drinkChoice == 2;
        boolean isGlenRioAle = drinkChoice == 3;

        if (isWater)
        {
            System.out.println("Here is your water");
        }
        else if (isCola)
        {
            System.out.println("Here is your cola");
        }
        else if (isGlenRioAle)
        {
            System.out.println("What is your age?");
            int userAge = userinput.nextInt();
            if (userAge >= 21)
            {
                System.out.println("Here is your cola");
            }
            else if (userAge == 20)
            {
                System.out.println("No drink for you! Come back in 1 year");
            }
            else
            {
                System.out.println("No drink for you! Come back in " + (21 - userAge) + " years.");
            }
        }
        else
        {
            System.out.println("Please enter a 1, 2 or 3.");
        }
    }
}
