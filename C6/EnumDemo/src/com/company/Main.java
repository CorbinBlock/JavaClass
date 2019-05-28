package com.company;

public class Main
{
    //function in c means method in java
    public static void main(String[] args)
    {
        Weather today = Weather.SNOWING;
        Weather tomorrow = Weather.RAINING;
        Weather dayAfterTomorrow = Weather.CLEAR;
        if (today == Weather.RAINING)
        {
            System.out.println("It's going to rain today");
        }
        printWeather(today);
        printWeather(tomorrow);
        printWeather(dayAfterTomorrow);


    }

    private static void printWeather(Weather weather)
    {
        switch (weather)
        {

            case RAINING:
                System.out.println("Raining")
                break;
            case CLEAR:
                System.out.println("Clear");
                break;
            case SNOWING:
                System.out.println("Snowing");
                break;
            default:
                System.out.println("I don't know what's going on");
        }
        if (weather == Weather.RAINING)
        {
            System.out.println("Raining");
        }
        else
        {
            System.out.println("Not raining");
        }

    }
}
