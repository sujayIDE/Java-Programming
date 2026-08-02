package com.sujay.service;

import com.sujay.exception.InSufficientFundException;
import com.sujay.exception.InvalidAmountException;

public class AccountService {
    private double balance;

    public AccountService(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount)
    {
        if(amount<0)
        {
            throw new InvalidAmountException("Enter valid amount...");
        }
        balance+=amount;
        System.out.println("Amount deposit success...");
        System.out.println("Balance: "+balance);
    }

    public void withdraw(double amount)
    {
        if(amount>balance)
        {
            throw new InSufficientFundException("Insufficient amount...");
        }
        if(amount<0)
        {
            throw new InvalidAmountException("Enter valid amount...");
        }

        balance-=amount;
        System.out.println("Amount withdraw success...");
        System.out.println("Balance: "+balance);
    }
}
