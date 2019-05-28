package com.company;

public class Main {

    public static void main(String[] args) {
        java.util.Scanner userinput = new java.util.Scanner(System.in);  //java.util.Scanner is a class
        System.out.println("I will multiply two numbers. Please enter your first number and press enter");
        double numberEntered = userinput.nextInt();
        System.out.println("Please enter your second number");
        double numberEntered2 = userinput.nextInt();
        double product = numberEntered*numberEntered2;
        System.out.println("The product of " + numberEntered + " and " + numberEntered2 + " is " + product + ".");


    }
}
