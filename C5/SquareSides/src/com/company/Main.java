package com.company;

public class Main
{

    public static void main(String[] args)
    {
        int triangleSides = getTriangleSides();
        System.out.println("A triangle has " + triangleSides + " sides.");

        int squareSides = getSquareSides();
        System.out.println("A square has " + squareSides + " sides.");
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
    private static int getSquareSides()
    {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("How many sides does a square have: ");
        int squareSides = scanner.nextInt();
        while (squareSides != 4)
        {
            System.out.println("How many sides does a square have: ");
            squareSides = scanner.nextInt();
        }

        return squareSides;

    }
}

