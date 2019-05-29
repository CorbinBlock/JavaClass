package com.company;

public class Boat
{
    private int smallFish;
    private int mediumFish;
    private int largeFish;

    public void caughtSmallFish()   //overloaded each constructor
    {
        smallFish++;
    }

    public void caughtMediumFish()
    {
        mediumFish++;
    }

    public void caughtLargeFish()
    {
        largeFish++;
    }

    public void caughtSmallFish(int quantity)
    {
        smallFish += quantity;
    }

    public void caughtMediumFish(int quantity)
    {
        mediumFish += quantity;
    }

    public void caughtLargeFish(int quantity)
    {
        largeFish += quantity;
    }

    public int getTotalWeight()
    {
        int totalWeight = smallFish;
        totalWeight += 5 * mediumFish;
        totalWeight += 10 * largeFish;
        return totalWeight;
    }

    public boolean isCloseToSinking()    //this is a business question - should this be false when the boat is already stuck? (210+)
    {
        return getTotalWeight() > 200;
    }

    public boolean isSunk()
    {
        return getTotalWeight() > 210;
    }
}
