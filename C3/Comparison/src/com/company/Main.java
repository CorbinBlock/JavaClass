package com.company;

public class Main
{

    public static void main(String[] args)
    {
        String txt = "Fantastic ";
        String lang = "Java";

        boolean state = (txt == lang);   //assign test result
        System.out.println("String equality test: " + state);
        state = (txt != lang); //assign result
        System.out.println("String inequality test: " + state);

        int dozen = 12;
        int score = 20;
        state = (dozen > score); //assign result
        System.out.println("Greater than test: " + state);
        state = (dozen < score); //assign result
        System.out.println("Less than test: " + state);


    }
}
