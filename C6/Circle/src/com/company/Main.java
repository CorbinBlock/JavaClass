package com.company;

public class Main
{

    public static void main(String[] args)
    {
        Circle myCircle = new Circle(3.0);

        System.out.println("Radius is: " + myCircle.getRadius() + " Area is: " + myCircle.getArea() + " and the Diameter is: " + myCircle.getDiameter());
    }
}
