package com.company;

public class Main
{

    public static void main(String[] args)
    {
        int withdrawalAmount = 2553;
        System.out.println("Withdrawal amount is: " + withdrawalAmount);
        int twentyRemain = withdrawalAmount % 20;
        int twentyAmount = (withdrawalAmount - twentyRemain) / 20;
        System.out.println("You will receive " + twentyAmount + " twenty dollar bill(s).");
        int cashAfter20 = withdrawalAmount - (twentyAmount * 20);
        int tenRemain = cashAfter20 & 10;
        int tenAmount = (cashAfter20 - tenRemain) / 10;
        System.out.println("You will receive " + tenAmount + " ten dollar bill(s).");
        int cashAfter10 = cashAfter20 - (tenAmount * 10);
        int fiveRemain = cashAfter10 & 5;
        int fiveAmount = (cashAfter10 - fiveRemain) / 5;
        System.out.println("You will receive " + fiveAmount + " five dollar bill(s).");
        int cashAfter5 = cashAfter10 - (fiveAmount * 5);
        int oneAmount = cashAfter5 / 1;
        System.out.println("You will receive " + oneAmount + " one dollar bill(s).");
        double variableFee = (twentyAmount + tenAmount + fiveAmount + oneAmount) * .1;
        int fixedFee = 1;
        double totalFee = variableFee + fixedFee;
        double totalCredit = totalFee + withdrawalAmount;
        System.out.println("The variable fee is " + variableFee);
        System.out.println("The fixed fee is " + fixedFee);
        System.out.println("The total fee is " + totalFee);
        System.out.println("Your account was credited in total for " + totalCredit);


    }
}
