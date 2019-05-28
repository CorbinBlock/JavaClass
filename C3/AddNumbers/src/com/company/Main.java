package com.company;

public class Main
{

    public static void main(String[] args)
    {
        java.util.Scanner userinput = new java.util.Scanner(System.in);  //java.util.Scanner is a class
        System.out.println("I will add two numbers. Please enter the first number.");
        double numberEntered = userinput.nextInt();
        System.out.println("The number you have entered was: " +numberEntered);
        System.out.println("I will add two numbers. Please enter the first number.");
        double numberEntered2 = userinput.nextInt();
        System.out.println("The number you have entered was: " +numberEntered2);
        double sum = numberEntered + numberEntered2;
        System.out.println("The total of " + numberEntered + " and " + numberEntered2 + " is " + sum + ".");


    }
}
