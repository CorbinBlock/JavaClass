package com.company;

public class Spaceship
{
    private String shipName;
    private int passengerCount;

    public Spaceship(String shipName)
    {
        this.shipName = shipName;
    }

    public int addPassenger()
    {
        passengerCount++;
        return passengerCount;
    }

    public int removePassenger()
    {
        passengerCount--;
        return passengerCount;
    }

    public int removeAllPassengers()
    {
        passengerCount = 0;
        return passengerCount;
    }

    public String getShipDescription()
    {
        return "Spaceship Name: " + shipName + " Total Passenger(s): " + passengerCount;
    }

}
