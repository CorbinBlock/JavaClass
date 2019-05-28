package com.company;

public class Account
{
    String customerName;
    double balance; //reserves a place in memory eight bytes wide for "balance"
    double interestRate;
    String address;
    public Account(String customerName)          //Account is a hidden method with a hidden return type of Account.
    {
        //construtor - creates required fields
        this.customerName = customerName;
    }

    //this is a blueprint of what an account is composed of
    //this resembles how we would code in C. there is a class for the account types and another class for the
    //various methods that interact with the account type.
    //now object and methods are in the same class
    public void printStatement(Account this)
    {
        System.out.println("Customer: " + this.customerName);
        System.out.println("Address: " + this.address);
        System.out.println("Balance: " + this.balance);
        System.out.println("Interest Rate: " + this.interestRate);
    }

    public void printCDOffer(Account this)
    {
        System.out.println("Hi, " + this.customerName);
        System.out.println("Wouldn't you like to invest some of your " + this.balance + " in a CD?");
        System.out.println("You are only getting a lousy " + this.interestRate + " on your account");
    }                //various methods that interact with the account type.
}