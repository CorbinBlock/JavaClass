package com.company;

public class Main
{

    public static void main(String[] args)
    {
        System.out.println("Hello, world!");        // println is a call to a method. "Hello, world!" is the argument, or data passed to the method
        sayHi(); // go to sayHi method
        System.out.println("I'm back here again.");

        int count = 0;
        while (count < 10)
        {
            sayHi();
            count++;
            String title = "Manager";
            printName(title, "Fred");


        }
    }

    private static void sayHi()    //public methods can call other public methods in different classes, private cannot. we have only used main method
    {
        System.out.println("Hi there!");
    }

    private static void printName(String title, String name)     //parameter in parenthesis - receives the argument.
    {
        String title = "Blah"
        System.out.println("Title is: ", title);
        System.out.println("////" + name + "\\\\\\\\");
    }
    private static void add(int a, int b, int c)
    {
        int total = a + b + c;
        System.out.println(total);
    }
}
