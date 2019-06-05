package com.company;

public class DoWhileDemo
{

    public static void main(String[] args)
    {
        System.out.println("Hi there. I am before the do while loop");
        int count = 0;
        do
        {
            System.out.println("Hi there. I am in the do while loop. By the way, count equals: " + count);
            count++;
        } while (count < 3); //test happens after the execution of the loop, will always perform at least once.
        System.out.println("Hi there. I am after the do while loop. Count is: " + count);
    }
}
