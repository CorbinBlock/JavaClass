package com.company;

public class Main
{

    public static void main(String[] args)
    {
        java.util.Scanner userinput = new java.util.Scanner(System.in);  //java.util.Scanner is a class
        System.out.println("Enter your number: ");
        int userNumber = userinput.nextInt();

        if (userNumber > 99)
        {
            System.out.println("The number is large");
        }
        else if (userNumber < 10)
        {
            System.out.println("The number is small");
        }
        else
        {
            System.out.println("The number is neither large nor small");
        }
    }
}
