package com.company;

public class Main
{

    public static void main(String[] args)
    {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.println("What shape do you wish to calculate?");
        System.out.println("Please enter C for circle, S for square, R for rectangle.");
        String shapeType = input.nextLine();
        switch (shapeType)
        {
            case "c":
            case "C":
                System.out.println("You chose a circle!");
                System.out.println("What is your circle's radius?");
                int radius = input.nextInt();
                System.out.println("Your circle's area is: " + circleArea(radius));
                System.out.println("Your circle's perimeter is: " + circlePerimeter(radius));

                break;
            case "s":
            case "S":
                System.out.println("You chose a square!");
                System.out.println("What is your square's length?");
                int length = input.nextInt();
                System.out.println("Your square's area is:  " + squareArea(length));
                System.out.println("Your square's perimeter is:  " + squarePerimeter(length));
                break;
            case "r":
            case "R":
                System.out.println("You chose a rectangle!");
                System.out.println("What is your rectangle's height?");
                int height = input.nextInt();
                System.out.println("What is your rectangle's length?");
                int lengthRectangle = input.nextInt();
                System.out.println("Your square's area is:  " + rectangleArea(height, lengthRectangle));
                System.out.println("Your square's perimeter is:  " + rectanglePerimeter(height, lengthRectangle));
                break;

            default:
                System.out.println("Invalid value: " + shapeType);

        }
    }

    private static double circleArea(int radius)
    {
        double area = Math.PI * (radius * radius);
        return area;
    }

    private static double circlePerimeter(int radius)
    {
        double perimeter = 2 * Math.PI * radius;
        return perimeter;
    }

    private static double squareArea(int length)
    {
        double area = length * length;
        return area;
    }

    private static double squarePerimeter(int length)
    {
        double perimeter = 4 * length;
        return perimeter;
    }

    private static double rectangleArea(int height, int lengthRectangle)
    {
        double area = height * lengthRectangle;
        return area;
    }

    private static double rectanglePerimeter(int height, int lengthRectangle)
    {
        double perimeter = (2 * lengthRectangle) + (2 * height);
        return perimeter;
    }
}
