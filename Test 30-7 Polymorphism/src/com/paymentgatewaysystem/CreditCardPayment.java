package com.paymentgatewaysystem;

public class CreditCardPayment extends Payment{
    private int cardNumber;

    public CreditCardPayment(int transactionId,String customerName,double amount)
    {
        super(transactionId, customerName, amount);
        this.cardNumber=cardNumber;
    }

    @Override
    void pay() {
        System.out.println("Processing Credit Card Payment...\n" +
                "Verifying Card Details...\n" +
                "Checking Available Balance...\n" +
                "Payment of ₹<amount> Successful using Credit Card.");
    }
}
