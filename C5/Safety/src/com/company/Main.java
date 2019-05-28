package com.company;

public class Main
{

    public static void main(String[] args)
    {
        //String returnValue = getMyName();              //commented out to test other methods
        //System.out.println("###" + returnValue + "###"); //commented out to test other methods
        System.out.println(getTotal(10, 20));
        System.out.println(getTotal(5, 4));
        System.out.println(getTotal(12, 12));
        int max = getMax(4, 4);
        System.out.println(max);
        isThunderDome(2,1);
        isThunderDome(1,2);
        isThunderDome(2,2);
        safeSpeed(0);
        safeSpeed(14);
        safeSpeed(15);
        safeSpeed(16);



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
    private static boolean isThunderDome(int enteredCount, int leavingCount)
    {
        boolean isThunderdome = enteredCount == 2 && leavingCount == 1;
        System.out.println("Is this the thunderdome? " + isThunderdome);
        return isThunderdome;
    }
    private static int safeSpeed(int neighborSpeed)
    {
        int safespeed = neighborSpeed - 15;
        System.out.println("Neighbor speed is: " + neighborSpeed);
        System.out.println("Safe speed is: " + safespeed);
        return safespeed;
    }
}
