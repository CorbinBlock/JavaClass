package com.company;

public class Triangle
{
    private int sideA;
    private int sideB;
    private int sideC;

    public int getSideA()
    {
        return sideA;
    }

    public void setSideA(int sideA)
    {
        this.sideA = sideA;
    }

    public int getSideB()
    {
        return sideB;
    }

    public void setSideB(int sideB)
    {
        this.sideB = sideB;
    }

    public int getSideC()
    {
        return sideC;
    }

    public void setSideC(int sideC)
    {
        this.sideC = sideC;
    }

    public int getPerimeter()
    {
        return sideA + sideB + sideC;
    }

    public boolean isEquilateral()
    {
        return ((sideA == sideB) && (sideB == sideC));
    }

}
