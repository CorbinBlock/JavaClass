package com.company;

public class Main
{

    public static void main(String[] args)
    {
        // write your code here
    }

    public boolean lessBy10(int a, int b, int c)
    {
        boolean lessBy10 = true;
        int aLessB = a - b;
        int aLessC = a - c;
        int bLessA = b - a;
        int bLessC = b - c;
        int cLessA = c - a;
        int cLessB = c - b;
        if (aLessB >= 10 || aLessC >= 10 || bLessA >= 10 || bLessC >= 10 || cLessA >= 10 || cLessB >= 10)
        {
            return lessBy10;
        }
        else
        {
            return !lessBy10;
        }
    }
}
