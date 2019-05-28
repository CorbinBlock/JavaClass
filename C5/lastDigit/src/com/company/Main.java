package com.company;

public class Main
{

    public static void main(String[] args)
    {
        // write your code here
    }

    public static boolean lastDigit(int a, int b, int c)
    {
        boolean lastDigit = true;
        int lastA = a % 10;
        int lastB = a % 10;
        int lastC = a % 10;

        if (a > 0 && b > 0 && c > 0)
        {
            if (lastA == lastB || lastB == lastC || lastC == lastA)
            {
                return lastDigit;
            }
            else
            {
                return !lastDigit;
            }
        }
        else
        {
            return !lastDigit;
        }
    }
}
