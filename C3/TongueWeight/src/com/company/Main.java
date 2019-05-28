package com.company;

public class Main
{

    public static void main(String[] args)
    {
        java.util.Scanner userinput = new java.util.Scanner(System.in);  //java.util.Scanner is a class
        System.out.println("I will calculate the ideal tongue weight. Please enter your trailer weight: ");
        double trailerWeight = userinput.nextDouble();
        System.out.println("Please enter your cargo weight: ");
        double cargoWeight = userinput.nextDouble();
        double totalWeight = trailerWeight + cargoWeight;
        double lowerTongue = totalWeight * .09;
        double upperTongue = totalWeight * .15;
        System.out.println("Your ideal tongue weight is between " + lowerTongue + " and " + upperTongue + ".");
    }
}