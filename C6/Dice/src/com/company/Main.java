package com.company;

public class Main
{

    public static void main(String[] args)
    {
        Die mySixSidedDie = new Die();
        Die myTwentySidedDie = new Die(25);

        //if you don't roll the die, it will return 0 bc it is int and not string (null) //added a constructor to roll first
        mySixSidedDie.roll();
        System.out.println("I rolled: " + mySixSidedDie.getValue());
        myTwentySidedDie.roll();
        System.out.println("I rolled: " + myTwentySidedDie.getValue());

        Dice dice = new Dice();
        System.out.println("I rolled: " + dice.getValue());
    }
}
