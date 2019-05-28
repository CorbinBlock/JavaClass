package com.company;

public class Main
{

    public static void main(String[] args)
    {
        TrafficLightColor red = TrafficLightColor.RED;
        TrafficLightColor yellow = TrafficLightColor.YELLOW;
        TrafficLightColor green = TrafficLightColor.GREEN;

        printLight(red);
        nextLight(red);
        printLight(yellow);
        nextLight(yellow);
        printLight(green);
        nextLight(green);


    }

    private static void printLight(TrafficLightColor trafficLight)
    {
        switch (trafficLight)
        {
            case RED:
                System.out.println("Stop");
                break;
            case YELLOW:
                System.out.println("Caution");
                break;
            case GREEN:
                System.out.println("Go");
                break;
            default:
                System.out.println("Invalid");
        }
    }

    private static TrafficLightColor nextLight(TrafficLightColor trafficLight)
    {
        switch (trafficLight)
        {
            case RED:
                System.out.println("Next: " + TrafficLightColor.GREEN);
                return TrafficLightColor.GREEN;
            case YELLOW:
                System.out.println("Next: " + TrafficLightColor.RED);
                return TrafficLightColor.RED;
            case GREEN:
                System.out.println("Next: " + TrafficLightColor.YELLOW);
                return TrafficLightColor.YELLOW;
            default:
                return trafficLight;
        }
    }
}
