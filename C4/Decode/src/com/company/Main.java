package com.company;

public class Main
{
    public static void main(String[] args)
    {
        int offset = 5;
        int DOWNSHIFT = 26;

        char first = 'W';
        char middle = 'C';
        char last = 'B';

        first += offset;

        if (first > 'Z')
        {
            first -= DOWNSHIFT;
        }

        middle += offset;

        if (middle > 'Z')
        {
            middle -= DOWNSHIFT;
        }

        last += offset;

        if (last > 'Z')
        {
            last -= DOWNSHIFT;
        }
        System.out.println("The below initials are encoded");
        System.out.println(first);
        System.out.println(middle);
        System.out.println(last);

        first -= offset;

        if (first < 'A')
        {
            first += DOWNSHIFT;
        }

        middle -= offset;

        if (middle < 'A')
        {
            middle += DOWNSHIFT;
        }

        last -= offset;

        if (last < 'A')
        {
            last += DOWNSHIFT;
        }
        System.out.println("The below initials are decoded");
        System.out.println(first);
        System.out.println(middle);
        System.out.println(last);

    }
}