package com.company;

public class Main
{

    public static void main(String[] args)
    {
        java.util.Random random = new java.util.Random();
        int number1 = random.nextInt(10);
        System.out.println(number1);
        number1++;

        System.out.println(number1);
    }
}
