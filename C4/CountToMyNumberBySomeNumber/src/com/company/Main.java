package com.company;

public class Main
{

    public static void main(String[] args)
    {
        java.util.Scanner userinput = new java.util.Scanner(System.in);  //java.util.Scanner is a class

        System.out.println("Count to what number? (must be greater than or equal to zero) ");
        int maxCount = userinput.nextInt();
        System.out.println("By what interval? (must be greater than or equal to zero): ");
        int userInterval = userinput.nextInt();
        int zero = 0;

        while (zero != maxCount)
        {
            if (maxCount < 0 && userInterval < 0 || userInterval > maxCount)
            {
                System.out.println("Count to what number? (must be greater than or equal to zero) ");
                maxCount = userinput.nextInt();
                System.out.println("By what interval? (must be greater than or equal to zero): ");
                userInterval = userinput.nextInt();
            }
            else
            {
                System.out.println("Number: " + zero);
                zero = zero + userInterval;
                System.out.println("Number + " + userInterval + ": " + zero);
            }
        }


    }
}
