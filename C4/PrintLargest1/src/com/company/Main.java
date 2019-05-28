package com.company;

public class Main
{

    public static void main(String[] args)
    {
        java.util.Scanner userinput = new java.util.Scanner(System.in);  //java.util.Scanner is a class
        System.out.println("Enter your number: ");
        int number1 = userinput.nextInt();
        System.out.println("Enter your second number: ");
        int number2 = userinput.nextInt();
        if (number1 > number2)
        {
            System.out.println(number1 + " is larger than " + number2);
        }
        else if (number2 > number1)
        {
            System.out.println(number2 + " is larger than " + number1);
        }
        else
        {
            System.out.println("The numbers are equal");
        }
    }
}
