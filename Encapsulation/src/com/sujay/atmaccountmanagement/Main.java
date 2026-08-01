package com.sujay.atmaccountmanagement;

public class Main {
    public static void main(String[] args) {
        Account account=new Account(1010101,10000);

        System.out.println("===ACCOUNT DETAILS===");
        System.out.println("Account Number: "+account.getAccountNumber());
        System.out.println("Current Balance: "+account.getBalance());

        System.out.println("=========================================");

        System.out.println("..........Deposit Amount......");
        account.deposit(2000);
        System.out.println("Current balance after deposit: "+account.getBalance());

        System.out.println("============================================");
        account.withdraw(15000);
        System.out.println("Current balance after withdraw: "+account.getBalance());


    }
}
