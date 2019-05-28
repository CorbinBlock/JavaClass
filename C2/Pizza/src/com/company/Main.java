package com.company;

public class Main
{

    public static void main(String[] args)
    {
        int diameter = 10;
        System.out.println(diameter);
        int radius = diameter / 2;
        System.out.println("The radius of the pizza is: " + radius);
        double area = (radius * radius) * Math.PI;
        System.out.println("The diameter of the pizza is: " + diameter);
        System.out.println("The area of the pizza is: " + area);

        if (diameter > 0 && diameter < 10)
        {
            System.out.println("A " + diameter + " inch pizza should yield 4.0 slices.");
        } else if (diameter > 7 && diameter < 11)
        {
            System.out.println("A " + diameter + " inch pizza should yield 6.0 slices.");
        } else if (diameter > 11 && diameter < 17)
        {
            System.out.println("A " + diameter + " inch pizza should yield 8.0 slices.");
        } else
        {
            System.out.println("That is a lot of slices.");}


    }
}
