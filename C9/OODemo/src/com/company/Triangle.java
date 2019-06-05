package com.company;

public class Triangle
{
    public int sideA;
    public int sideB;
    public int sideC;


    public Triangle(int sideA, int sideB, int sideC)
    {
        this.sideA = sideA;      //this refers to variables accessible inside the class, but not the method.
        this.sideB = sideB;     //will not reach outside the method unless you put int.
        this.sideC = sideC;         //this is a constructor
    }
}
