package com.synchronizedmethod.atmmachine;

public class Atm {
    private int balance=10000;

    synchronized void withdraw(int amount){
        if(amount>balance){
            throw new InsufficientBalance("Insufficient Balance...");
        }
        if(amount<0)
        {
            throw new InvalidAmount("Invalid Amount...");
        }
        balance-=amount;
        System.out.println("Amount withdraw successful...."+amount);

    }

}
