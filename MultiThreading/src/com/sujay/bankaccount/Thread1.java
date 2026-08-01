package com.sujay.bankaccount;

public class Thread1 extends Thread{
    BankAccount bankAccount;

    public Thread1(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    @Override
    public void run() {
        bankAccount.withdraw(7000);
    }
}
