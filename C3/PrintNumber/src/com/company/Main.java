package com.company;

public class Main
{

    public static void main(String[] args)
    {
        java.util.Scanner userinput = new java.util.Scanner(System.in);  //java.util.Scanner is a class
        System.out.println("Please enter a number and press enter");
        double numberEntered = userinput.nextInt();
        System.out.println("The number you have entered was: " +numberEntered);

    }
}
