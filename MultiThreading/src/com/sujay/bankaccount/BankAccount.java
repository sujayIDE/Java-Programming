package com.sujay.bankaccount;

public class BankAccount {
    private int accountNumber;
    private double balance;

    public BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(int amount)
    {
        try {
            if(amount<0)
            {
                throw new RuntimeException("Amount not valid....");
            }
            System.out.println("Amount Deposit successful...");
            balance+=amount;
            System.out.println("Balance is: "+balance);
        }catch (RuntimeException ex)
        {
            System.out.println(ex.getMessage());
        }
    }

    public synchronized void withdraw(int amount)
    {
        try
        {
            Thread.sleep(2000);
            if(amount>balance)
            {
                throw new RuntimeException("Insuffiecient Balance...");
            }
            if(amount<=0)
            {
                throw new RuntimeException("Enter valid amount....");
            }
            System.out.println("Withdraw successfull....");
            balance-=amount;
            System.out.println("Balance: "+balance);
        } catch (RuntimeException | InterruptedException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
