package com.company;

public class Main
{

    public static void main(String[] args)
    {
        String returnValue = getMyName();
        System.out.println(returnValue);
    }

    private static String getMyName()
    {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Enter your first name: ");
        String name = scanner.nextLine();
        return name;
    }
}
