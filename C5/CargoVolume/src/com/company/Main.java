package com.company;

public class Main
{

    public static void main(String[] args)
    {
        System.out.println(getCargoVolume(10.5, 12.5, 15.5));
    }

    private static double getCargoVolume(double height, double length, double depth)
    {
        double materialThickness = .25;
        double heavyDuty = materialThickness * 2;
        int questionResponse;
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        do
        {
            System.out.println("Is the cargo material heavy duty? Please respond: 1 for Yes 2 for N");
            questionResponse = scanner.nextInt();
        } while (questionResponse != 1 && questionResponse != 2);
        if (questionResponse == 1)
        {
            return (height - 2 * heavyDuty) * (length - 2 * heavyDuty) * (depth - 2 * heavyDuty);

        }
        else
        {
            return (height - 2 * materialThickness) * (length - 2 * materialThickness) * (depth - 2 * materialThickness);

        }
    }
}
