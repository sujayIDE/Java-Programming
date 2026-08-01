package com.ATM;

public class ATM {
    private int accountNumber;
    private int pin;
    private double balance;
    private int failedAttempts;
    private boolean accountLocked;

    public ATM(int accountNumber, int pin, double balance, int failedAttempts, boolean accountLocked) {
        this.accountNumber = accountNumber;
        this.pin = pin;
        this.balance = balance;
        this.failedAttempts = failedAttempts;
        this.accountLocked = accountLocked;
    }

    boolean authenticate(int userpin)
    {
        if(accountLocked)
        {
            System.out.println("Account locked...");
            return false;
        }

        if(userpin==pin)
        {
            failedAttempts=0;
            System.out.println("Login Successful...");
            return true;
        }else {
            failedAttempts++;
            System.out.println("Invalid Pin...");

            if(failedAttempts>=3)
            {
                accountLocked=true;
                System.out.println("Account locked...");
            }
        }
        return false;
    }

    void deposit(double amount)
    {
        if(amount<0)
        {
            System.out.println("Enter valid amount...");
            return;
        }
        balance+=amount;
        System.out.println("Deposit Successful..."+amount);
        System.out.println("Current balance after deposit: "+balance);
    }

    void withdraw(double amount)
    {
        if(amount>balance)
        {
            System.out.println("Insufficient fund...");
            return;
        }
        if(amount<0)
        {
            System.out.println("Enter valid amount...");
            return;
        }
        balance-=amount;
        System.out.println("Withdraw Successful..."+amount);
        System.out.println("Current balance after withdraw: "+balance);
    }

    void checkBalance()
    {
        System.out.println("Account Number: "+accountNumber+" Balance: "+balance);
    }

    void changePin(int newpin)
    {
            pin=newpin;
            System.out.println("Pin Changed Successfully....");
    }

    boolean isLocked()
    {
        return accountLocked;
    }
}
