package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
    public boolean squirrelPlay(int temp, boolean isSummer)
    {
        boolean squirrelPlay = true;
        if (isSummer)
        {
            if(temp >= 60 && temp <= 100)
            {
                return squirrelPlay;
            }
            else
            {
                return !squirrelPlay;
            }
        }
        else if(temp >= 60 && temp <= 90)
        {
            return squirrelPlay;
        }
        else
        {
            return !squirrelPlay;
        }
    }
}


