package com.company;

public class Circle
{
    private double radius;

    public void setRadius(double radius)
    {
        this.radius = radius;
    }

    public double getArea()
    {
        return Math.PI * (radius * radius);
    }

    public double getDiameter()
    {
        return radius * 2;
    }

}
