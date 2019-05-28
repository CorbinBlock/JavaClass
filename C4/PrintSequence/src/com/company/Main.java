package com.company;

public class Main
{

    public static void main(String[] args)
    {
        int hundred = 100;

        while (hundred >= -100)
        {
            System.out.println("Counting down... " + hundred);
            hundred = hundred - 8;
        }
    }
}
