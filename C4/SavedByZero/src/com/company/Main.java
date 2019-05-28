package com.company;

public class Main
{

    public static void main(String[] args)
    {
        java.util.Scanner userinput = new java.util.Scanner(System.in);  //java.util.Scanner is a class

        int userNumber = 1;
        int nextTurn = -1;

        do
        {
            System.out.println("Enter a number: ");
            userNumber = userinput.nextInt();
            nextTurn++;
            if (userNumber != 0)
            {
                System.out.println("Try again.");
            }
            //if (userNumber== 0)
            //            {
            //                break;
            //            }
            //  System.out.println("Try again.")  //considered bad form //best form to show one way to exit the loop
        } while(userNumber != 0);

        System.out.println("You entered a number other than zero " + nextTurn + " times.");


    }
}
