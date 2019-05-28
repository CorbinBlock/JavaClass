package com.company;

public class Main
{

    public static void main(String[] args)
    {
        System.out.println("Start of program");
        int number = 20;

        do   //int failed test of while loop, so program ended.  //while does test before each iteration of loop
        {
            System.out.println(number);
            number++;
        } while (number <= 10);    // do while for when you want to do something at least once.
        System.out.println("End of program");
    }
}
