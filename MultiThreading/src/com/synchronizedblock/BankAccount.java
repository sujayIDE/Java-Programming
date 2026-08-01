package com.synchronizedblock;

public class BankAccount {
    private int balance=10000;
    synchronized void withdraw(int amount)
    {
        System.out.println("---WELCOME TO ATM---");
        synchronized (this)
        {
            if(amount>balance)
            {
                System.out.println(Thread.currentThread().getName()+" Insufficient balance...");
            }else {
                System.out.println(Thread.currentThread().getName()+" Amount is withdraw successfull...");
                System.out.println("Withdraw Amount: "+amount);
                balance-=amount;
                System.out.println("Balance: "+balance);
            }
        }
        System.out.println("Thank you visit again...");
    }
}
