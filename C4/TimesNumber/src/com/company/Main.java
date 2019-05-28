package com.company;

public class Main
{

    public static void main(String[] args)
    {
        java.util.Scanner userinput = new java.util.Scanner(System.in);  //java.util.Scanner is a class

        System.out.println("Enter a number to multiply: ");
        int userNumber = userinput.nextInt();
        int i = 0;

        while (i <= 9)
        {
           if(userNumber > 0 && userNumber <= 10)
           {
               i++;

               System.out.printf("%2d X ", userNumber);
               System.out.printf("%2d = ", i);
               System.out.printf("%2d%n", userNumber * i);
           }
           else
           {
               System.out.println("Please enter a number between 1 and 10:");
               userNumber = userinput.nextInt();
           }
        }



    }

}

