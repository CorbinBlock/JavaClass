package com.company;

public class Main
{

    public static void main(String[] args)
    {
        java.util.Scanner userinput = new java.util.Scanner(System.in);  //java.util.Scanner is a class
        System.out.println("Gatekeeper: What is the rider's height in inches? ");
        int heightInches = userinput.nextInt();
        boolean isRedBand = heightInches <= 36;
        boolean isYellowBand = heightInches > 36 && heightInches < 54;
        boolean isGreenBand = heightInches >= 54 && heightInches < 80;
        boolean isNoBand = heightInches >= 80;
        if (isRedBand)
        {
            System.out.println("Rider will receive a red band.");
        }
        else if (isYellowBand)
        {
            System.out.println("Rider will receive a yellow band.");
        }
        else if (isGreenBand)
        {
            System.out.println("Rider will receive a green band.");
        }
        else
        {
            System.out.println("Rider will receive no band.");
        }
    }
}
