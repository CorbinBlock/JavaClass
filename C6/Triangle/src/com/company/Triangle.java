package com.company;

public class Triangle
{
    private int sideA;
    private int sideB;
    private int sideC;

    public void setSideA(int sideA)
    {
        this.sideA = sideA;
    }

    public void setSideB(int sideB)
    {
        this.sideB = sideB;
    }

    public void setSideC(int sideC)
    {
        this.sideC = sideC;
    }

    public int getPerimeter()
    {
        return (sideA + sideB + sideC);
    }

    public boolean isEquilateral()
    {
        return (sideA == sideB && sideB == sideC);
    }

    public boolean isIsosceles()
    {
        return (sideA == sideB || sideB == sideC || sideC == sideA);
    }

    public boolean isScalene()
    {
        return (sideA != sideB && sideB != sideC && sideA != sideC);
    }
}
