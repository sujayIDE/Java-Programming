package com.Interthreadcommunication.bankaccount;


public class Customer2 extends Thread{
    BankAccount bankAccount;

    public Customer2(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(2000);
            bankAccount.deposit(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
