package com.company;

public class Main
{

    public static void main(String[] args)
    {
        inOrder(1,2,3,true);
    }
    public boolean inOrder(int a, int b, int c, boolean bOk)
    {
        boolean inOrder = true;
        if (bOk = true)
        {
            if (c > b)

            {
                return inOrder;
            }
            else
            {
                return !inOrder;
            }
        }
        else if (c > b && b > a)
        {
            return inOrder;
        }
        else
        {
            return !inOrder;
        }
    }
}



