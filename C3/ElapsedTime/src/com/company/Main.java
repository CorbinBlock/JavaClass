package com.company;

public class Main
{

    public static void main(String[] args)
    {
        java.util.Scanner userinput = new java.util.Scanner(System.in);  //java.util.Scanner is a class
        System.out.println("How many whole seconds has elapsed: ");
        double numberEntered = userinput.nextInt();
        double hoursRemain = numberEntered % 3600;
        double hoursElapsed = (numberEntered - hoursRemain) / 3600;
        System.out.println(hoursElapsed + " hour(s) have elapsed.");
        double remainingTimeAfterHoursInMinutes = (numberEntered - (hoursElapsed * 3600) * 60);
        double minuteRemain = remainingTimeAfterHoursInMinutes % 60;
        double minutesElapsed = (remainingTimeAfterHoursInMinutes - minuteRemain)%60;
        double secondsElapsed = numberEntered - (hoursElapsed * 3600) - (minutesElapsed * 60);
        System.out.println(minutesElapsed + " minute(s) have elapsed.");
        System.out.println(secondsElapsed + " second(s) have elapsed.");


    }
}
