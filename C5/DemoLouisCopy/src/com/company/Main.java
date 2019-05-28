package com.company;

public class Main
{
    public static void main(String[] args)
    {
        sayHi();
        System.out.println("Hello, world!");
        sayHi();
        System.out.println("I'm back here again");

        String title = "Manager";
        String name = "Fred";
        printName(title, name);
    }

    private static void sayHi()
    {
        System.out.println("Hi there!");
    }

    private static void printName(String employeeTitle, String name)
    {
        System.out.println("Title is:" + employeeTitle);
        System.out.println("////" + name + "\\\\\\\\");
    }
}