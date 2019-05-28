package com.company;

public class Main
{

    public static void main(String[] args)
    {
        java.util.Scanner userinput = new java.util.Scanner(System.in);  //java.util.Scanner is a class
        System.out.println("Enter your number: ");
        int userNumber = userinput.nextInt();
int numberRemainder2 = userNumber % 2;
boolean isEven = numberRemainder2 < 1;
if (isEven)
{
    System.out.println("The number is even");
}
else
{
    System.out.println("The number is odd");
}
    }
}
