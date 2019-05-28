package com.company;

public class Main
{

    public static void main(String[] args)
    {
        printSum();
        printSum();

    }

    private static void printSum()
    {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.println("Enter first number: ");
        int number1 = input.nextInt();
        System.out.println("Enter second number: ");
        int number2 = input.nextInt();
        System.out.println(number1 + " + " + number2 + " = " + number1 + number2);
    }
}
