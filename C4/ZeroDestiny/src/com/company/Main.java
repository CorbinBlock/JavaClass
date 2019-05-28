package com.company;

public class Main
{

    public static void main(String[] args)
    {
        java.util.Scanner userinput = new java.util.Scanner(System.in);  //java.util.Scanner is a class

        System.out.println("Enter a number: ");
        int userNumber = userinput.nextInt();
        int userAttempts = 0;
        int zero = 0;

        while (userNumber != zero)
        {
            userAttempts++;
            System.out.println("Enter a number: ");
            userNumber = userinput.nextInt();

        }

        userAttempts++;
        System.out.println("Congratulations! Your entered a number other than zero " + userAttempts + " times.");
    }

}

