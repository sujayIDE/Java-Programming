package com.paymentgatewaysystem;

public class UpiPayment extends Payment{
    String upiId;

    public UpiPayment(int transactionId,String customerName,double amount,String upiId) {
        super(transactionId,customerName,amount);
        this.upiId = upiId;
    }


    @Override
    void pay() {
        System.out.println("Processing UPI Payment...\n" +
                "Sending Request to UPI Server...\n" +
                "Authenticating UPI PIN...\n" +
                "Payment of ₹<amount> Successful using UPI.");
    }
}
