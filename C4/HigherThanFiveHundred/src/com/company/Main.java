package com.company;

public class Main
{

    public static void main(String[] args)
    {
        java.util.Scanner userinput = new java.util.Scanner(System.in);  //java.util.Scanner is a class

        int attemptCount = 0;
        int userSum = 0;

        do
        {
            System.out.println("Enter a number: ");
            int userNumber = userinput.nextInt();
            attemptCount++;
            userSum += userNumber;
        } while (userSum <= 500);

        System.out.println("You reached a total of " + userSum + " to obtain a total greater than 500.");
        if (attemptCount == 1)
        {
            System.out.println("You entered " + attemptCount + " number.");
        }
        else
        {

            System.out.println("You entered " + attemptCount + " numbers.");
        }

    }
}
