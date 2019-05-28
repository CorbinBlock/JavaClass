package com.company;

public class Main
{

    public static void main(String[] args)
    {
        java.util.Scanner userinput = new java.util.Scanner(System.in);  //java.util.Scanner is a class

        System.out.println("Enter the end of your number tree: ");
        int userNumber = userinput.nextInt();

        while (userNumber <= 5)
        {
            int innerNumber = 1;
            while (innerNumber <= userNumber)
            {
                System.out.print(innerNumber + " ");
                innerNumber++;
            }
            System.out.println();
            userNumber++;
        }
    }


}



