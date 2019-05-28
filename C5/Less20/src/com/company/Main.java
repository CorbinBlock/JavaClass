package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
    public boolean less20(int n)
    {
        boolean less20 = true;
        if(n < 0)
        {
            return !less20;
        }
        else if(((n + 1) % 20) == 0 || ((n + 2) % 20) == 0)
        {
            return less20;
        }
        else
        {
            return !less20;
        }
    }


}
