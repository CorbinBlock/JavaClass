package com.company;

public class Main
{

    public static void main(String[] args)
    {
        int count = 1;

        while (count <= 7)
        {
            System.out.println("Hello, world!");
            count++;          //increment statement placed in while loop for readability
        }
        System.out.println("Bye");

        int number = 1;
        int sum = 0;
        while (number <= 10)
        {
            System.out.println(number);
            number += 3;            //make change to number at the end of the loop
        }


    }
}
