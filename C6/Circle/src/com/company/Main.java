package com.company;

public class Main
{

    public static void main(String[] args)
    {
        Circle circle = new Circle();
        double radius = 3;
        circle.setRadius(radius);
        double area = circle.getArea();
        double diameter = circle.getDiameter();
        System.out.println("Radius is: " + radius + " Area is: " + area + " and the Diameter is: " + diameter);

        radius = 4;
        circle.setRadius(radius);
        area = circle.getArea();
        diameter = circle.getDiameter();
        System.out.println("Radius is: " + radius + " Area is: " + area + " and the Diameter is: " + diameter);


    }
}
