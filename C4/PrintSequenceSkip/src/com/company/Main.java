package com.company;

public class Main
{

    public static void main(String[] args)
    {
        int hundred = 100;
        int i = 0;
        while (hundred >= -100)
        {
            if( i == 10)
            {
                System.out.println("Counting down from 100..." + hundred);
                hundred = (hundred/-1) - 8;
                i++;
            }
            else
            {
                System.out.println("Counting down from 100..." + hundred);
                hundred = hundred - 8;
                i++;

            }
        }

    }
}
