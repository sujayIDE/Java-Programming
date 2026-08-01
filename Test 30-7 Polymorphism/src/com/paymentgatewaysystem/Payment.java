package com.paymentgatewaysystem;

public class Payment {
    private int transactionId;
    private String customername;
    private double amount;

    public Payment(int transactionId, String customername, double amount) {
        this.transactionId = transactionId;
        this.customername = customername;
        this.amount = amount;
    }

    void displayTransactionDetails()
    {
        System.out.println("Transaction ID : "+transactionId);
        System.out.println("Customer Name  : "+customername);
        System.out.println("Amount         : "+amount);
    }

    void pay()
    {
        System.out.println("Processing payment.....");
    }
}
