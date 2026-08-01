package com.ATM;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ATM atm=new ATM(1010101,6909,40000,0,false);

        Scanner scanner=new Scanner(System.in);
        System.out.println("====ATM=====");
        while(true)
        {
            System.out.print("Enter PIN: ");
            int userPin = scanner.nextInt();

            if(atm.authenticate(userPin))
            {
                System.out.println("Login successful...");
                break;
            }

            if(atm.isLocked())
            {
                System.out.println("Account is Lock...");
                return;
            }
        }

        System.out.println("*****************************");

        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. CheckBalance");
        System.out.println("4. Change Pin");

        System.out.print("Enter your Choice: ");
        int choice= scanner.nextInt();

        switch (choice)
        {
            case 1:
                System.out.println("Enter Deposit amount: ");
                double depositamount= scanner.nextDouble();
                atm.deposit(depositamount);
                break;

            case 2:
                System.out.println("Enter Withdraw amount: ");
                double withdrawamount= scanner.nextDouble();
                atm.withdraw(withdrawamount);
                break;

            case 3:
                atm.checkBalance();
                break;

            case 4:
                System.out.println("Enter New Pin: ");
                int newpin= scanner.nextInt();
                atm.changePin(newpin);
                break;

            default:
                System.out.println("Enter Valid Choice....");
        }
    }
}
