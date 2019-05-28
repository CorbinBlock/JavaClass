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
        System.out.println("Enter third number: ");
        int number3 = input.nextInt();
        System.out.println("Enter fourth number: ");
        int number4 = input.nextInt();
        System.out.println("Enter fifth number: ");
        int number5 = input.nextInt();
        System.out.println(number1 + " + " + number2 + " + " + number3 + " + " + number4 + " + " + number5 + " = " + (number1 + number2 + number3 + number4 + number5));
    }
}
