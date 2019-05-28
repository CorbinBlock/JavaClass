package com.company;

public class Main
{

    public static void main(String[] args)
    {
        Account account = new Account("Fred Flintstone"); //this is a reference to a variable to enter data
        account.balance = 23.45;     //should not use primitive type for monetary amounts once we learn new method
        account.interestRate = 0.005;
        account.address = "Bedrock";

        Account account2 = new Account("Wilma Flintstone"); //this is a reference to a variable to enter data
        account2.balance = 5623.45;     //should not use primitive type for monetary amounts once we learn new method
        account2.interestRate = 0.055;
        account2.address = "Bedrock";

        // Account account3 = new Account();

        //there is a method called account that we may call.
        //how can we group groups of parameters for our methods? a new class!
        //shifting to C++ to print these methods.

        //constructors

        account.printStatement();
        account.printCDOffer();

        account2.printStatement();
        account2.printCDOffer();

        //account3.printStatement();

    }


}

