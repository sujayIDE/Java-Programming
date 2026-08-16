package atmmachine;

import java.util.Scanner;

public class Atm {
    private double balance;
    private int pin;

    public Atm(double balance, int pin) {
        this.balance = balance;
        this.pin = pin;
    }

    void checkBalance()
    {
        System.out.println("Current Balance : "+balance);
    }

    int countDeposit=0;
    double totaldepostedAmount=0;
    void deposit(double amount)
    {
        if(amount<=0)
        {
            throw new InvalidAmount("Invalid valid amount Deposit amount must be greater than ₹0....");
        }
        countDeposit++;
        balance+=amount;
        totaldepostedAmount+=amount;
        System.out.println("Deposit Successful...");
        System.out.println("Current Balance : "+balance);
    }

    int countWithdraw=0;
    double totalWithdrawAmount=0;
    void withdraw(double amount)
    {
        if(amount>balance)
        {
            throw new InsufficientBalance("Insufficient Balance.......");
        }
        if(amount<=0 || amount%100!=0)
        {
            throw new InvalidAmount("Invalid Amount Withdrawal amount must be greater than ₹0 Amount is not a multiple of ₹100....");
        }

        double remainingBalance=balance-amount;
        if(remainingBalance<500)
        {
            throw new MinimumBalance("Minimum Account balance is 500 Maintained...");
        }
        countWithdraw++;
        totalWithdrawAmount+=amount;
        balance-=amount;
        System.out.println("Withdraw Successful....");
        System.out.println("Current Balance : "+balance);

    }

    Scanner sc=new Scanner(System.in);
    void changePin()
    {
        System.out.println("Enter Current PIN : ");
        int currentPin = sc.nextInt();

        if (currentPin != pin) {
            System.out.println("Incorrect Current PIN.");
            return;
        }
            System.out.println("Enter New Pin : ");
            int newPin=sc.nextInt();

            System.out.println("Enter Confirm New Pin : ");
            int comfirmPin=sc.nextInt();

            if(newPin>=1000 && newPin<=9999 && newPin==comfirmPin){
                pin=newPin;
                System.out.println("Pin Change SuccessFully...");
            }else{
                System.out.println("Enter PIN must contain exactly 4 digits.and password mismatch ");
            }
        }


    void miniStatement()
    {
        System.out.println("Number of Deposits : "+countDeposit);
        System.out.println("Number of Withdrawals : "+countWithdraw);
        System.out.println("Total Deposited Amount : "+totaldepostedAmount);
        System.out.println("Total Withdrawn Amount : "+totalWithdrawAmount);
    }

    void exit()
    {
        System.out.println("Thank you for using our ATM.\n" +
                "Please collect your card.\n");
        System.exit(0);
    }

}
