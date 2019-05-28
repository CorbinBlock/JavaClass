package com.company;

public class Main
{

    public static void main(String[] args)
    {
        double averageBalance = 5.67;
        int wholeNumberPart = (int)averageBalance;
        System.out.println(wholeNumberPart);

        int score = 12;
        double floatingPointScore = score;
        System.out.println(floatingPointScore);

        boolean winning = true;
        System.out.println("Winning: " + winning);

        int maxScore = 20;
        int currentScore = 19;
        boolean gameOver = currentScore >= maxScore;
        System.out.println("Gameover: " + gameOver);

        boolean isMonday = true;
        boolean isRaining = false;
        boolean stayHome = isMonday && isRaining;
        System.out.println("Stay Home: " + stayHome);

        boolean takeCar = isMonday || isRaining;
        System.out.println("Take Car: " + takeCar);
    }
}
