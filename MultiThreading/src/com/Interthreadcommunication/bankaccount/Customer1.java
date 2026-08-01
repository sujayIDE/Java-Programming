package com.Interthreadcommunication.bankaccount;


public class Customer1 extends Thread{
    BankAccount bankAccount;

    public Customer1(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }


    @Override
    public void run() {
        try {
            bankAccount.withdraw(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
