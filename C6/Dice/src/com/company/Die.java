package com.company;

public class Die
{
    private final int sides;
    private int value; //we created a private value that can only be accessed with a private method

    //private class can only be accessed by private
    public Die()
    {
        this.sides = 6;
        roll();
    }

    public Die(int sides)
    {
        this.sides = sides;
        roll();
    }

    public int getValue()
    {
        return this.value;
    }

    public void roll()
    {
        java.util.Random random = new java.util.Random(); //just a longer name for a class in a different library.
        value = random.nextInt(sides) + 1;

    }
}
