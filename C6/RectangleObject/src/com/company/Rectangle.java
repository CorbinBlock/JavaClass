package com.company;

public class Rectangle
{
    private int width;
    private int height;


    public int doubleHeight(int height)
    {
        return height = height * 2;
    }

    public int doubleWidth(int width)
    {
        return width = width * 2;
    }

    public int rotateHeight(int height, int width)
{
    System.out.println("The new width is: " + height);
    return height;

}
    public int rotateWidth(int height, int width)
    {
        System.out.println("The new height is: " + width);
        return width;

    }
}
