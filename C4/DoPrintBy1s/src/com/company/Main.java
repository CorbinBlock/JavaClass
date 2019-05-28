package com.company;

public class Main
{

    public static void main(String[] args)
    {
        int one = 1;
        int ten = 10;
        System.out.println(one);
        do
        {
            one++;
            System.out.println(one);
        } while(one < 10);
        System.out.println(ten);
        do
        {
            ten--;
            System.out.println(ten);
        } while (ten > 1);
    }
}
