package com.company;

public class Main
{
    public static void main(String[] args)
    {
        final int WINNING_SCORE = 12;
        java.util.Random random = new java.util.Random();
        int playerOnePosition = 0;
        int playerTwoPosition = 0;

        do
        {
            //Player One
            int die1 = random.nextInt(6) + 1;
            int die2 = random.nextInt(6) + 1;

            System.out.println("Player One Rolled: " + die1 + " and " + die2);

            int rollNeeded;

            if (playerOnePosition == 0)
            {
                rollNeeded = 5;
            }
            else
            {
                rollNeeded = playerOnePosition + 1;
            }

            if (die1 == rollNeeded || die2 == rollNeeded || die1 + die2 == rollNeeded)
            {
                playerOnePosition++;

                if (playerOnePosition == playerTwoPosition)
                {
                    System.out.println("NO SOUP FOR YOU PLAYER TWO!");
                    playerTwoPosition = 0;
                }
            }
            System.out.println("Player One score is: " + playerOnePosition);

            //Player Two
            die1 = random.nextInt(6) + 1;
            die2 = random.nextInt(6) + 1;

            System.out.println("Player Two Rolled: " + die1 + " and " + die2);

            if (playerTwoPosition == 0)
            {
                rollNeeded = 5;
            }
            else
            {
                rollNeeded = playerTwoPosition + 1;
            }

            if (die1 == rollNeeded || die2 == rollNeeded || die1 + die2 == rollNeeded)
            {
                playerTwoPosition++;

                if (playerOnePosition == playerTwoPosition)
                {
                    System.out.println("NO SOUP FOR YOU PLAYER ONE!");
                    playerOnePosition = 0;
                }
            }
            System.out.println("Player Two score is: " + playerTwoPosition);

        } while (playerOnePosition  < WINNING_SCORE && playerTwoPosition < WINNING_SCORE);

        System.out.println("We have a winner");
    }
}