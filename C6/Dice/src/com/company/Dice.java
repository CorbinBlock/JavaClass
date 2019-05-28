package com.company;

public class Dice
{
    private Die die1;
    private Die die2;

    public Dice()
    {
        die1 = new Die(); //we have abstracted away the die object and just return a value from it.
        die2 = new Die(); //math.Random returns a double.
        roll();
    }

    public void roll()
    {
        die1.roll();
        die2.roll();
    }

    public int getValue()
    {
        return die1.getValue() + die2.getValue();
    }
}
