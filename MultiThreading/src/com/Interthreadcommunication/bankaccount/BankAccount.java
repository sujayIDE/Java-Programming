package com.Interthreadcommunication.bankaccount;

public class BankAccount {
    private int balance;

    public BankAccount(int balance) {
        this.balance = balance;
    }

    public synchronized void deposit(int amount)
    {
        if(amount<0)
        {
            throw new RuntimeException("Please enter valid amount...");
        }
        System.out.println("Deposit successfull...");
        balance=balance+amount;
        System.out.println("Balance: "+balance);
        notify();
    }

    public synchronized void withdraw(int amount) throws InterruptedException {
        if(balance<amount)
        {
            System.out.println("Thread2 wait for valid amount...");
            wait();
        }
        System.out.println("Withdraw success...");
        balance=balance-amount;
        System.out.println("balance: "+balance);
        notify();
    }

}
