package com.company;

public class Main
{

    public static void main(String[] args)
    {
        java.util.Scanner userinput = new java.util.Scanner(System.in);  //java.util.Scanner is a class
        System.out.println("Enter your first number");
        int firstNumber = userinput.nextInt();
        System.out.println("Enter your second number");
        int secondNumber = userinput.nextInt();
        System.out.println("Enter your third number");
        int thirdNumber = userinput.nextInt();
        if (firstNumber + 1 == secondNumber && secondNumber + 1 == thirdNumber)
        {
            System.out.println("In a row!");
        }
        else
        {
            System.out.println("Not in a row!");
        }
    }
}
