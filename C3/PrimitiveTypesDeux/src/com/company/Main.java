package com.company;

public class Main
{

    public static void main(String[] args)
    {
        float flt = 1.0f / 3.0f; // f suffix means float constant
        double dbl = 1.0 / 3.0; //no suffix means double constant

        System.out.println(flt); //.3333334
        System.out.println(dbl); //displays .33333

        dbl = 3.99999999;
        long lg = (long) dbl;    //fractional part truncated
        System.out.println(lg);

    }
}
