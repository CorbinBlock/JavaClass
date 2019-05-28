package com.company;

public class Main
{

    public static void main(String[] args)
    {
        final double MIN_SLICE_SQUARE_INCHES = 13.0;
        double pizzaDiameter = 10.0;
        double pizzaRadius = pizzaDiameter / 2;
        double pizzaArea = 3.14 * pizzaRadius * pizzaDiameter;
        System.out.println("The pizza area is: " + pizzaArea + " square inches.");
        double slices = pizzaArea / MIN_SLICE_SQUARE_INCHES;
        System.out.println("You can get " + (int) slices + " slices out of that pizza.");
    }
}
