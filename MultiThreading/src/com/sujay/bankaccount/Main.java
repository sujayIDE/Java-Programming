package com.sujay.bankaccount;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount=new BankAccount(1010101,10000);

        Thread1 thread1=new Thread1(bankAccount);
        Thread2 thread2=new Thread2(bankAccount);

        thread1.start();
        thread2.start();
    }
}
