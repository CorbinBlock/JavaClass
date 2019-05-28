package com.company;

public class Dashboard
{
    private int speed;
    private int rpm;

    public void setSpeed(int speed)
    {
        this.speed = speed;           //a accessor would return a value to the person calling it (none coded here)
    }

    public void setRpm(int rpm)          //setters pass through a value but typically do not return anything
    {
        this.rpm = rpm;
    }

    public String getDisplay()
    {
        return "Speed: " + speed + " RPM: " + rpm;
    }
}
