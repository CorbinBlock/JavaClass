package com.company;

public class Car
{
    private int passengerCount;

    public Car(int passengerCount)
    {
        this.passengerCount = passengerCount;
    }

    public int setPassengerCount(int passengerCount)
    {
        if (passengerCount < 0)
        {
            return 0;
        }
        else
        {
            return passengerCount;
        }
    }

}
