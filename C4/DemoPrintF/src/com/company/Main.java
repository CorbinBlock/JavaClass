package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(20);
        System.out.println(200);
        System.out.println(2000);

        System.out.printf("%4d%n", 20);    //% is a special character here
        System.out.printf("%4d%n", 200);    //% is a special character here
        System.out.printf("%4d%n", 2000);    //% is a special character here

        String format = "%4d %4d%n";
        System.out.printf(format, 20, 560);    //% is a special character here
        System.out.printf(format, 200, 1);    //% is a special character here
        System.out.printf(format, 2000, 5);    //% is a special character here

        System.out.println(1.0/3.0);
        System.out.printf("%5.4f", 100.0/3.0);  // 5 is how many digits .4 is how many decimal places

    }
}
