package com.company;

public class Main
{

    public static void main(String[] args)
    {
        int five = 5;
        int seven = 7;
        boolean greaterThan = five > seven;
        boolean numberEquals = five == seven;
        System.out.println("     Truth Table");
        System.out.println(" s     b   | a && b");
        System.out.println("-------------------");
        System.out.println("false false | " + (false && false));
        System.out.println("false true | " + (false && false));
        System.out.println("true false | " + (false && false));
        System.out.println("true true | " + (true && true));

    }
}
