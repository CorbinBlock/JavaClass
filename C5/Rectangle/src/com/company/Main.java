package com.company;

public class Main
{

    public static void main(String[] args)
    {
        System.out.println(getArea(4, 5));
        System.out.println(getPerimeter(4,5));
    }

    private static int getArea(int height, int width)
    {
        return height * width; //returns area
    }

    private static int getPerimeter(int height, int width)
    {
        return (height * 2) + (width * 2); //returns perimeter
    }
}
