package com.company;

public class Main
{

    public static void main(String[] args)
    {
        int zero = 0;
        int hundred = 100;
        while (zero <= 100)
        {
            System.out.println("Counting up by 1: " + zero);
            zero = zero + 10;
        }
        while (hundred > 0)
        {
            System.out.println("Counting down by 1 " + hundred);
            hundred = hundred - 10;
        }
    }
}
