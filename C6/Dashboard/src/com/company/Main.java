package com.company;

public class Main
{

    public static void main(String[] args)
    {                                                     //creates a new dashboard object from the class
        Dashboard dashboard = new Dashboard();            //IDE autofilled Dashboard because it knows that convention
        dashboard.setSpeed(65); //these two are called mutators because they alter the dashboard object
        dashboard.setRpm(1500);
        String display = dashboard.getDisplay();
        System.out.println(dashboard.getDisplay());         //this prints the value that .getDisplay() pulls (a string)
                    //if above row was before the .setSpeed, it would return a 0 value because the internal state of the dashboard object was not mutated.

        dashboard.setSpeed(75); //these two are called mutators because they alter the dashboard object
        dashboard.setRpm(2000);
        display = dashboard.getDisplay();
        System.out.println(dashboard.getDisplay());
    }
}
