package com.sujay.atmaccountmanagement;

public class Account {
    private int accountNumber;
    private double balance;

    public Account(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    void deposit(int amount)
    {
        if(amount>0)
        {
            balance+=amount;
            System.out.println("Amount deposit successfully....");
        }
        else {
            System.out.println("Enter valid amount...");
        }
    }

    void withdraw(int amount)
    {
        if(amount>balance)
        {
            System.out.println("Insufficient fund...");
        }
        else {
            balance-=amount;
            System.out.println("Withdraw successfull...");
        }
    }

    double getBalance()
    {
        return balance;
    }

}
