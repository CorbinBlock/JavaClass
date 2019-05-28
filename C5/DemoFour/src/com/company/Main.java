package com.company;

public class Main
{

    public static void main(String[] args)
    {
        printProduct(4,5);
        getProduct(4,5);
        System.out.println(getProduct(4,5));
        System.out.println("I rolled: " + getSixSidedDieRoll());
    }

    private static void printProduct(int a, int b)            //crafting system
    {
        System.out.println(a + " X " + b + " = " + a * b);
    }
    private static int getProduct(int a, int b)
    {
        int answer = a * b;
        return answer;

    }
    private static int getSixSidedDieRoll()
    {
        java.util.Random random = new java.util.Random();
        int roll = random.nextInt(6) + 1;
        return roll;
    }
}
