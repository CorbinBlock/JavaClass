package com.company;

public class ForEachDemo
{

    public static void main(String[] args)
    {
        System.out.println("Hi there. I am before the for each loop");

        int[] values = {0,1,2,3};

        //for each value in values //considered as the least error-prone loop.
        //may show us iterator on the last day of class (weird way to do for each before this was implemented)
        for (int value : values)
        {
            System.out.println("Hi there. I am in the for each loop. By the way, value is: " + value);
        }
        System.out.println("Hi there. I am after the do while loop. Count is: out of scope.");
    }
}
