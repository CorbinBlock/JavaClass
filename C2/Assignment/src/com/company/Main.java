package com.company;

public class Main
{

    public static void main(String[] args)
    {
        String text = "Fantastic ";
        String lang = "Java";
        text += lang; //assign concatenated String
        System.out.println("Add & Assign Strings: " + text);

        int sum = 10;
        int num = 20;
        sum += num; //Assign result (10 + 20 = 30)
        System.out.println("Add and assign integers:" + sum) ;

        int factor = 5;
        sum *= factor; //assign result (30 X 5 = 150)
        System.out.println("Multiplication sum: " + sum);

        sum /= factor; //Assign result (150 / 5 = 30)
        System.out.println("Division sum: " + sum);

    }
}
