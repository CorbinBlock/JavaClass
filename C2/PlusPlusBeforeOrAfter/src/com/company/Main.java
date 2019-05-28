package com.company;

public class Main
{

    public static void main(String[] args)
    {
        int x = 1;
        int before = ++x;
        System.out.println("x is: " + x);
        System.out.println("before is: " + before);

        int y = 1;
        int after = y++;
        System.out.println("y is: " + y);
        System.out.println("after is: " + after);
    }
}
