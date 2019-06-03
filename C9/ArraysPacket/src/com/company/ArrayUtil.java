package com.company;


public class ArrayUtil
{


    public static void printArray(int values[])
{
    int index = 0;

    while (index < values.length)
    {
        System.out.println(values[index]);
        index++;
    }
}
    public static void printArrayString(String values[])
    {
        int index = 0;

        while (index < values.length)
        {
            System.out.println(values[index]);
            index++;
        }
    }

    public static int arrayTotal(int values[])
    {
        int index = 0;
        int sum = 0;

        while (index < values.length)
        {
            sum = sum + values[index];
            index++;
        }
        return sum;
    }

    public static int arrayMax(int values[])
    {
        int maxSoFar = values[0];

        for (int value : values)
        {
            if (value > maxSoFar)
            {
                maxSoFar = value;
            }
        }
        return maxSoFar;
    }

    public static double arrayAverage(double values[])
    {
        int index = 0;
        double sum = 0;

        while (index < values.length)
        {
            System.out.println(values[index]);
            sum = sum + values[index];
            index++;
        }
        return sum / values.length;
    }

    public static int maxIndex(int values[]) //what position is max in array
    {
        int maxSoFar = values[0];
        int currentIndex = 0;
        int maxIndex = 0;

        for (int value : values)
        {
            if (value > maxSoFar)
            {
                maxSoFar = value;
                maxIndex = currentIndex;
            }
            currentIndex++;
        }
        return maxIndex;
    }
}


