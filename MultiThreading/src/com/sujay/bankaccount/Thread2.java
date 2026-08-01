package com.sujay.bankaccount;

public class Thread2 extends Thread{
    BankAccount bankAccount;

    public Thread2(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    @Override
    public void run() {
        bankAccount.withdraw(5000);
    }
}
