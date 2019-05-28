package com.company;

public class Main
{

    public static void main(String[] args)
    {
        int triangleSides = getTriangleSides();
        System.out.println("A triangle has " + triangleSides + " sides.");
    }

    private static int getTriangleSides()
    {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("How many sides does a triangle have: ");
        int triangleSides = scanner.nextInt();
        while (triangleSides != 3)
        {
            System.out.println("How many sides does a triangle have: ");
            triangleSides = scanner.nextInt();
        }

        return triangleSides;

    }
}

