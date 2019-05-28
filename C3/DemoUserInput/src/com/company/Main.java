package com.company;

public class Main
{

    public static void main(String[] args)
    {
        java.util.Scanner userinput = new java.util.Scanner(System.in);  //java.util.Scanner is a class
        System.out.println("Please enter a whole number and press enter");
        int numberEntered = userinput.nextInt();
        System.out.println("You entered the number: " + numberEntered);

        boolean numberIsLarge = numberEntered > 100;
        System.out.println("Number is large: " + numberIsLarge);
    }
}
