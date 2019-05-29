package com.company;

public class Score
{
    private int points;         //making data private and creating methods to control how the data is processed.
                                //this is called ENCAPSULATION - important term
    public void completedFieldGoal()
    {
        points += 3;
    }
    public void completedTouchDown()
    {
        points += 6;
    }

    public int getPoints()              //getter for points
    {
        return points;
    }
}
