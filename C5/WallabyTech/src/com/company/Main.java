package com.company;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import javax.xml.bind.SchemaOutputResolver;

public class Main
{

    public static void main(String[] args)
    {

        printHeader();

        int age = printAge();

        String firstName = printFirstName();
        String lastName = printLastName();

        int employeeNumber = printEmployeeNumber();

        System.out.println(lastName + ", " + firstName);

        printEvenOrOdd(employeeNumber);

        System.out.println("Your age is: " + age);

        boolean isEven = printEvenOrOdd(employeeNumber);

        System.out.println("Employee number is even: " + isEven);

        int secretPassword = printGeneratedSecretPassword(employeeNumber);
        System.out.println("Employee's random secret password is: " + secretPassword);


    }

    private static void printHeader()
    {
        System.out.println("Welcome to the WallabyTech Employee Application");
        System.out.println("===============================================");
    }

    private static String printFirstName()
    {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Enter your first name: ");
        String firstName = scanner.nextLine();
        return firstName;
    }

    private static String printLastName()
    {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Enter your last name: ");
        String lastName = scanner.nextLine();
        return lastName;

    }

    private static int printEmployeeNumber()
    {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Please enter your five digit employee number: ");
        int employeeNumber = scanner.nextInt();
        return employeeNumber;
    }

    private static int printAge()
    {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Enter your birth year: ");
        int birthYear = scanner.nextInt();
        int age = 2019 - birthYear;
        return age;
    }

    private static boolean printEvenOrOdd(int employeeNumber)
    {
        boolean isEven = employeeNumber % 2 < 1;
        return isEven;

    }

    private static int printGeneratedSecretPassword(int employeeNumber)
    {
        java.util.Random random = new java.util.Random();
        int number = random.nextInt(11 + 1);
        int secretPassword = (employeeNumber + number) * 5;
        return secretPassword;
    }
}
