package com.company;

public class Date
{
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year)
    {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public int getDay()
    {
        return day;
    }

    public int getMonth()
    {
        return month;
    }

    public int getYear()
    {
        return year;
    }
    public String getFormattedDate()
    {
        return(year + "-" + month + "-" + day);
    }
}
