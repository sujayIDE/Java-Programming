package com.paymentgatewaysystem;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Payment payment;

        System.out.println("Enter Customer Name: ");
        String name=scanner.nextLine();

        System.out.println("Enter Amount: ");
        double amount= scanner.nextDouble();

        System.out.println("Payment choice:");
        System.out.println("1.CreditCard");
        System.out.println("2.NetBanking");
        System.out.println("3.Upi");

        System.out.println("Enter choice: ");
        int choice=scanner.nextInt();
        scanner.nextLine();
        switch (choice)
        {
            case 1:
                payment=new CreditCardPayment(101010101,name,amount);
                payment.displayTransactionDetails();
                payment.pay();

            case 2:
                payment=new NetBankingPayment(20202020,name,amount,"BOI");
                payment.displayTransactionDetails();
                payment.pay();

            case 3:
                payment=new UpiPayment(3030303,name,amount,"abc@sbi");
                payment.displayTransactionDetails();
                payment.pay();
        }
    }
}
