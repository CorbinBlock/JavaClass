package com.company;

public class Main
{

    public static void main(String[] args)
    {
        java.util.Scanner userinput = new java.util.Scanner(System.in);  //java.util.Scanner is a class

       int userNumber = 0;

       do
       {
           System.out.println("Enter a number: ");
           userNumber = userinput.nextInt();
       } while(userNumber != 99);

        System.out.println("I have been waiting so long.");


    }
}
