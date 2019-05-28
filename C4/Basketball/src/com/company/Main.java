package com.company;

public class Main
{
    public static void main(String[] args)
    {
        java.util.Random random = new java.util.Random();
        int playerOnePosition = 0;
        int playerTwoPosition = 0;
        int gameOver = 21;

        do
        {
            //Player One
            int die1 = random.nextInt(6) + 1;
            int die2 = random.nextInt(6) + 1;

            System.out.println("Rolled: " + die1 + " and " + die2);
            //int nextPosition = playerOnePosition + 1;


            if (die1 + die2 == 2)
            {
                playerOnePosition =+ 2;
                System.out.println("Field goal! Increase score by 3.");
                System.out.println("P1: " + playerOnePosition);
            }
            else if (die1 + die2 == 3)
            {
                System.out.println("Walking violation! Player loses ball");
                System.out.println("P1: " + playerOnePosition);

            }
            else if (die1 + die2 == 4)
            {
                System.out.println("2 pt field goal! Increase score by 2.");
                playerOnePosition =+ 2;
                System.out.println("P1: " + playerOnePosition);


            }
            else if (die1 + die2 == 5)
            {
                System.out.println("Foul shot! Increase score by 1");
                playerOnePosition++;
                System.out.println("P1: " + playerOnePosition);


            }
            else if (die1 + die2 == 6)
            {
                System.out.println("2 pt field goal! Increase score by 2.");
                playerOnePosition =+ 2;
                System.out.println("P1: " + playerOnePosition);


            }
            else if (die1 + die2 == 7)
            {
                System.out.println("Double dribble! Player loses ball.");
                System.out.println("P1: " + playerOnePosition);


            }
            else if (die1 + die2 == 8)
            {
                System.out.println("Two foul shots! Increase score by 2.");
                playerOnePosition =+ 2;
                System.out.println("P1: " + playerOnePosition);


            }
            else if (die1 + die2 == 9)
            {
                System.out.println("Missed jump shot! Player loses ball");
                System.out.println("P1: " + playerOnePosition);


            }
            else if (die1 + die2 == 10)
            {
                System.out.println("3 pt play: field goal and foul shot");
                playerOnePosition =+ 3;
                System.out.println("P1: " + playerOnePosition);


            }
            else if (die1 + die2 == 11)
            {
                System.out.println("Offensive foul: Player loses ball.");
                System.out.println("P1: " + playerOnePosition);


            }
            else
            {
                System.out.println("3 pt field goal! Increase score by 3.");
                playerOnePosition =+ 3;
                System.out.println("P1: " + playerOnePosition);


            }

            System.out.println("Player One score is: " + playerOnePosition);

            //Player Two
            die1 = random.nextInt(6) + 1;
            die2 = random.nextInt(6) + 1;

            System.out.println("Rolled: " + die1 + " and " + die2);
            //int nextPosition = playerOnePosition + 1;


            if (die1 + die2 == 2)
            {
                playerTwoPosition =+ 2;
                System.out.println("Field goal! Increase score by 3.");
                System.out.println("P2: " + playerTwoPosition);

            }
            else if (die1 + die2 == 3)
            {
                System.out.println("Walking violation! Player loses ball");
                System.out.println("P2: " + playerTwoPosition);

            }
            else if (die1 + die2 == 4)
            {
                System.out.println("2 pt field goal! Increase score by 2.");
                playerTwoPosition =+ 2;
                System.out.println("P2: " + playerTwoPosition);

            }
            else if (die1 + die2 == 5)
            {
                System.out.println("Foul shot! Increase score by 1");
                playerTwoPosition++;
                System.out.println("P2: " + playerTwoPosition);

            }
            else if (die1 + die2 == 6)
            {
                System.out.println("2 pt field goal! Increase score by 2.");
                playerTwoPosition =+ 2;
                System.out.println("P2: " + playerTwoPosition);

            }
            else if (die1 + die2 == 7)
            {
                System.out.println("Double dribble! Player loses ball.");
                System.out.println("P2: " + playerTwoPosition);

            }
            else if (die1 + die2 == 8)
            {
                System.out.println("Two foul shots! Increase score by 2.");
                playerTwoPosition =+ 2;
                System.out.println("P2: " + playerTwoPosition);

            }
            else if (die1 + die2 == 9)
            {
                System.out.println("Missed jump shot! Player loses ball");
                System.out.println("P2: " + playerTwoPosition);

            }
            else if (die1 + die2 == 10)
            {
                System.out.println("3 pt play: field goal and foul shot");
                playerTwoPosition =+ 3;
                System.out.println("P2: " + playerTwoPosition);

            }
            else if (die1 + die2 == 11)
            {
                System.out.println("Offensive foul: Player loses ball.");
                System.out.println("P2: " + playerTwoPosition);

            }
            else
            {
                System.out.println("3 pt field goal! Increase score by 3.");
                playerTwoPosition =+ 3;
                System.out.println("P2: " + playerTwoPosition);

            }


        } while (playerOnePosition < gameOver || playerTwoPosition < gameOver);
        if (playerOnePosition >= gameOver)
        {
            System.out.println("Player one's score of " + playerOnePosition + " has exceeded 21.");
        }
        else
        {
            System.out.println("Player two's score of " + playerTwoPosition + " has exceeded 21.");

        }
    }
}