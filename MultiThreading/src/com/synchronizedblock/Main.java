package com.synchronizedblock;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount=new BankAccount();

        CustomerThread customerThread1=new CustomerThread(bankAccount);
        CustomerThread customerThread2=new CustomerThread(bankAccount);

        customerThread1.start();
        customerThread2.start();
    }
}
