package com.company;

public class Main
{

    public static void main(String[] args)
    {
        System.out.println(absoluteSum(-4, 5));
        System.out.println(absoluteSum3(-1, 0, 1));
    }

    private static int absoluteSum(int number1, int number2)
    {
        int absolute1;
        int absolute2;
        if (number1 < 0)
        {
            absolute1 = number1 * -1;
        }
        else
        {
            absolute1 = number1;
        }
        if (number2 < 0)
        {
            absolute2 = number2 * -1;
        }
        else
        {
            absolute2 = number2;
        }
        return absolute1 + absolute2;
    }

    private static int absoluteSum3(int number1, int number2, int number3)
    {
        int absolute1;
        int absolute2;
        int absolute3;

        if (number1 < 0)
        {
            absolute1 = number1 * -1;
        }
        else
        {
            absolute1 = number1;
        }

        if (number2 < 0)
        {
            absolute2 = number2 * -1;
        }
        else
        {

            absolute2 = number2;
        }
        if (number3 < 0)
        {
            absolute3 = number3 * -1;
        }
        else
        {
            absolute3 = number3;
        }

        return absolute1 + absolute2 + absolute3;
    }
}
