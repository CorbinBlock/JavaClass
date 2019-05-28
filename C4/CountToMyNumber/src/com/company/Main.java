package com.company;

public class Main
{

    public static void main(String[] args)
    {
        java.util.Scanner userinput = new java.util.Scanner(System.in);  //java.util.Scanner is a class

        System.out.println("Enter your number (must be greater than or equal to zero): ");
        int maxCount = userinput.nextInt();
        int zero = 0;

        while (zero != maxCount)
        {
            if (maxCount < 0)
            {
                System.out.println("Enter your number (must be greater than or equal to zero): ");
                maxCount = userinput.nextInt();
            }
            else
            {
                System.out.println("Number: " + zero);
                zero++;
                System.out.println("Number +1: " + zero);
            }
        }


    }
}
