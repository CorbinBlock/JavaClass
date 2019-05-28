package com.company;

public class Main
{

    public static void main(String[] args)
    {
        java.util.Scanner userinput = new java.util.Scanner(System.in);  //java.util.Scanner is a class
        System.out.println("Enter your number: ");
        int number1 = userinput.nextInt();
        System.out.println("Enter your second number: ");
        int number2 = userinput.nextInt();
        int numberRemainder1 = number1 % 2;
        boolean isEven1 = numberRemainder1 < 1;
        boolean isOdd1 = numberRemainder1 > 0;
        int numberRemainder2 = number2 % 2;
        boolean isEven2 = numberRemainder2 < 1;
        boolean isOdd2 = numberRemainder2 > 0;
        int total = number1 + number2;
        if (isEven1 && isEven2)
        {
            System.out.println("Two evens make an even and that even number is: " + total);
        }
        else if (isOdd1 && isOdd2)
        {
            System.out.println("Two odds make an even and that even number is: " + total);
        }
        else
        {
            if (isEven1 && isOdd2)
            {
                System.out.println("The even number is " + number1);
                System.out.println("The odd number is " + number2);
            }
            else if (isEven2 && isOdd1)
            {
                System.out.println("The even number is " + number2);
                System.out.println("The odd number is " + number1);

            }

        }
    }
}
