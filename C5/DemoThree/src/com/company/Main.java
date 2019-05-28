package com.company;

public class Main
{

    public static void main(String[] args)
    {
        int number = sum(4, 5);
        System.out.println("The sum is: " + number);

        String someText = getTitle();
        System.out.println(someText);

        boolean isFour = isTheNumberFour(4);
        System.out.println("Is four? " + isFour);
    }

    private static int sum(int a, int b)   //void means nothing goes back to main //int lets your return back to
    {
        int total = a + b;
        return total;
    }

    private static String getTitle()
    {
        String titleName = "Manager";
        return titleName;
    }

    private static Boolean isTheNumberFour(int number)
    {
        boolean isFour = false;  //custom data types are called objects. Java is an object-oriented language centered around custom data types.

        if (number == 4)   //cannot be path where return will not return a value
        {
            isFour = true;
        }
        return isFour;
    }
}
