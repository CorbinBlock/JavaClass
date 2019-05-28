package com.company;

public class Main
{

    public static void main(String[] args)
    {
        // write your code here
    }

    public boolean inOrderEqual(int a, int b, int c, boolean equalOk)
    {
        boolean inOrderEqual = true;
        if (equalOk == true)
        {
            if (a == b || b == c || c == a && equalOk == true)
            {
                else if (a < b && b < c && a < c)
            {
                return inOrderEqual;
            }
            }
            else
            {

                if (a < b && b < c && a < c || a == b || b == c)

                {
                    return inOrderEqual;
                }
                else
                {
                    return !inOrderEqual;
                }
            }
           else if (a < b && b < c && a < c)
        {
            return inOrderEqual;
        }
        else
        {
            return !inOrderEqual;
        }
        }
    }
}