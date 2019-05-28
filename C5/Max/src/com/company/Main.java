package com.company;

public class Main
{

    public static void main(String[] args)
    {
        String returnValue = getMyName();
        System.out.println("###" + returnValue + "###");
        System.out.println(getTotal(10, 20));
        System.out.println(getTotal(5, 4));
        System.out.println(getTotal(12, 12));
        int max = getMax(4, 4);
        System.out.println(max);
    }

    private static String getMyName()
    {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Enter your first name: ");
        String name = scanner.nextLine();
        return name;
    }

    private static int getTotal(int firstNumber, int secondNumber)
    {
        int sum = firstNumber + secondNumber;
        return sum;
    }

    private static int getMax(int firstNumber, int secondNumber)
    {
        if (firstNumber > secondNumber)
        {
            int largerNum = firstNumber;
            return largerNum;
        }
        else if (secondNumber > firstNumber)
        {
            int largerNum = secondNumber;
            return largerNum;

        }
        else
        {
            int largerNum = 0;
            System.out.println("Neither number is larger");
            return largerNum;

        }
    }
}
