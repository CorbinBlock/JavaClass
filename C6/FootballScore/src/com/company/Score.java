package com.company;

public class Score
{
    private int points;

    public int completedFieldGoal(int points)
    {
        points = points + 3;
        return points;
    }

    public int completedTouchDown(int points)
    {
        return points + 6;
    }
}
