package com.company;

public class ForDemo
{

    public static void main(String[] args)
    {
        System.out.println("Hi there. I am before the for loop");

        for (int count = 0; count < 3; count++) //semi colon is valid statement by itself.
        {                   //format is (initializer; boolean; increment) //initializer's scope is only in loop
            System.out.println("Hi there. I am in the for loop. By the way, count equals: " + count);
            //count++; //count in for loop occurs during last line of the loop.
        }
        System.out.println("Hi there. I am after the for loop. Count is: out of scope.");
    }
}
