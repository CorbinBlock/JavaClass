package com.company;

public class Main
{

    public static void main(String[] args)
    {
        int counter = 0;
        int max = 10;
        do
        {
            sayHelloWorld();
            counter++;
        } while(counter < max);
    }
    private static void sayHelloWorld()
    {
        System.out.println("Hello World!");
        sayHelloWorld();
    }
}
