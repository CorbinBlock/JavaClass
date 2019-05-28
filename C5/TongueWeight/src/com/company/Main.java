package com.company;

public class Main
{
    public static void main(String[] args)
    {
       printRange();
    }
    private static void printRange()
    {
        final double MIN_PERCENT = .09;
        final double MAX_PERCENT = .15;

        java.util.Scanner in = new java.util.Scanner(System.in);

        System.out.println("Please enter the trailer weight.");
        double trailerWeight = in.nextDouble();

        System.out.println("Please enter the cargo weight.");
        double cargoWeight = in.nextDouble();

        double totalWeight = trailerWeight + cargoWeight;
        double minTongueWeight = totalWeight * MIN_PERCENT;
        double maxTongueWeight = totalWeight * MAX_PERCENT;

        System.out.println("The minimum tongue weight is:  " + minTongueWeight + " lbs.");
        System.out.println("The maximum tongue weight is:  " + maxTongueWeight + " lbs.");
    }
}
