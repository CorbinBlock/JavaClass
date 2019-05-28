package com.company;

public class Main
{

    public static void main(String[] args)
    {
    }

    // write your code here
    public boolean in1To10(int n, boolean outsideMode)
    {
        boolean is1To10 = true;
        if (outsideMode)
        {
            if (n <= 1 || n >= 10)
            {
                return is1To10;
            }
            else
            {
                return !is1To10;
            }
        }
        else if (n >= 1 && n <= 10)
        {
            return is1To10;
        }
        else
        {
            return !is1To10;
        }
    }


}


