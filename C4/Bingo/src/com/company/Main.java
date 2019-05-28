package com.company;

public class Main
{

    public static void main(String[] args)
    {
        java.util.Scanner userinput = new java.util.Scanner(System.in);  //java.util.Scanner is a class
        System.out.println("Enter your bingo letter");
        char bingoLetter = userinput.next().charAt(0);
        System.out.println("Enter your bingo number");
        int bingoNumber = userinput.nextInt();
        System.out.println("You entered: " + bingoLetter + bingoNumber);
        if (bingoLetter == 'B' && bingoNumber >= 1 && bingoNumber <= 15)
        {
            System.out.println("Valid");
        }
        else if (bingoLetter == 'I' && bingoNumber >= 16 && bingoLetter <= 30)
        {
            System.out.println("Valid");
        }
        else if (bingoLetter == 'N' && bingoNumber >= 31 && bingoLetter <= 45)
        {
            System.out.println("Valid");
        }
        else if (bingoLetter == 'G' && bingoNumber >= 46 && bingoLetter <= 60)
        {
            System.out.println("Valid");
        }
        else if (bingoLetter == 'O' && bingoNumber >= 61 && bingoLetter <= 75)
        {
            System.out.println("Valid");
        }
        else
        {
            System.out.println("Invalid");
        }
    }
}
