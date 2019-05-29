package com.company;

public class Boat
{
    private int smallFish;
    private int mediumFish;
    private int largeFish;

    public void caughtSmallFish()
    {
        smallFish++;
    }

    public int caughtMoreSmallFish(int smallFish)
    {
        return smallFish++;
    }

    public void caughtLargeFish()
    {
        largeFish++;
    }

    public int caughtMoreLargeFish(int largeFish)
    {
        return largeFish++;
    }

    public void caughtMediumFish()
    {
        mediumFish++;
    }

    public int caughtMoreMediumFish(int medumFish)
    {
        return mediumFish++;
    }

    public int getTotalWeight(int smallFish, int mediumFish, int largeFish)
    {
        return ((smallFish * 1) + (mediumFish * 5) + (largeFish * 10));
    }

    public boolean isClosetoSinking(int smallFish, int mediumFish, int largeFish)
    {
        int weight = (smallFish * 1) + (mediumFish * 5) + (largeFish * 10);
        return (200 < weight);
    }

    public boolean isSunk(int smallFish, int mediumFish, int largeFish)
    {
        int weight = (smallFish * 1) + (mediumFish * 5) + (largeFish * 10);
        return (210 < weight);
    }
}
