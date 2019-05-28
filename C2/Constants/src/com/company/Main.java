/*
    A program to demonstrate constant variables.
 */


package com.company;

public class Main {

    public static void main(String[] args) {
        // constant score values
    final int TOUCHDOWN = 6;
    final int CONVERSION = 1;
    final int FIELDGOAL = 3;
        // calculate points scored
    int td;
    int pat;
    int fg;
    int total;
        // Output calculated total
    td = 4 * TOUCHDOWN;
    pat = 3 * CONVERSION;
    fg = 2 * FIELDGOAL;
    total = (td + pat + fg);
        System.out.println("Score: " + total);
    }
}
