package com.Interthreadcommunication.bankaccount;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount=new BankAccount(3000);

        Customer1 customer1=new Customer1(bankAccount);
        Customer2 customer2=new Customer2(bankAccount);

        customer1.start();
        customer2.start();

    }
}
