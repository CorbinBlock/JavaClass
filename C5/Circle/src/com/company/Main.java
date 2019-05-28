package com.company;

public class Main
{

    public static void main(String[] args)
    {
        double radius = 5;

        System.out.println("The radius of the circle is: " + getArea(radius));
        System.out.println("The diameter of the circle is: " + getDiameter(radius));
        System.out.println("The circumference of the circle is: " + getCircumference(getDiameter(radius)));
    }

    private static double getArea(double radius)
    {
        return Math.PI * (radius * radius); //area of circle is pi times radius squared
    }

    private static double getDiameter(double radius)
    {
        return radius * 2;                   //diameter of circle is radius * 2
    }

    private static double getCircumference(double diameter)
    {
        return diameter * Math.PI;           //circumference of circle is pi times diameter
    }
}
