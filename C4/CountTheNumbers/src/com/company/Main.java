package com.company;

public class Main
{

    public static void main(String[] args)
    {
java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.println("Enter first number: ");
        final int number1 = input.nextInt();
        System.out.println("Enter second number: ");
        final int number2 = input.nextInt();

        int number = number1;
        int endNumber = number2;
        if (number1 != number2)
        {
            if (number1 < number2)
            {
                number = number1;
                endNumber = number2;
            }
            else
            {
                number = number2;
                endNumber = number1;
            }

            System.out.println("Counting...");

            while (number <= endNumber)
            {
                System.out.println(number);
                number++;
            }
        }
    }
}
