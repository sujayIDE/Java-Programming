package com.synchronizedblock;

public class CustomerThread extends Thread{
    BankAccount bankAccount;

    public CustomerThread(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    @Override
    public void run() {
            bankAccount.withdraw(7000);
        }
    }