package com.company;

public class Main
{

    public static void main(String[] args)
    {
        java.util.Scanner userinput = new java.util.Scanner(System.in);  //java.util.Scanner is a class

        System.out.println("Enter a number: ");
        int userNumber = userinput.nextInt();
        int userSum = 0;
        int userAttempts = 0;
        int maxSum = 1000;

        while (userSum < maxSum && userNumber < 1000)
        {
            userAttempts++;
            userSum = userNumber + userSum;
            System.out.println("Enter a number: ");
            userNumber = userinput.nextInt();

        }

        userAttempts++;
        userSum = userSum + userNumber;
        System.out.println("You have reached a total of " + userSum + " to finally obtain a total greater than 1000.");
        if (userAttempts == 1)
        {
            System.out.println("You entered " + userAttempts + " number.");

        }
        else
        {
            System.out.println("You entered " + userAttempts + " numbers.");

        }
    }

}

