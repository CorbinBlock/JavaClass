package com.company;

public class House
{
    private int roomCount;

    public House(int roomCount)  //this is constructor return type is inplied as  House.
    {
        this.roomCount = roomCount;
    }

    public int getRoomCount() //accessor right click > generate > getter
    {
        return roomCount;
    }
}
