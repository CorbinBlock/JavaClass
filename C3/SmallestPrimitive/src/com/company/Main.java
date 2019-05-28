package com.company;

public class Main
{

    public static void main(String[] args)
    {
        java.util.Scanner userinput = new java.util.Scanner(System.in);  //java.util.Scanner is a class
        System.out.println("Enter any whole number: ");
        long numberEntered = userinput.nextInt();
        boolean testInt = numberEntered >= -2147483648 && numberEntered <= 2147483647;
        boolean testByte = numberEntered >= -128 && numberEntered <= 127;
        boolean testShort = numberEntered >= -328768 && numberEntered <= 32767;
        boolean testLong = numberEntered >= -9223372036854775808l && numberEntered <= 9223372036854775807l;

        System.out.println("Would the number fit in an int? " + testInt);
        System.out.println("Would the number fit in a byte? " + testByte);
        System.out.println("Would the number fit in a short? " + testShort);
        System.out.println("Would the number fit in a long? " + testLong);


    }
}
