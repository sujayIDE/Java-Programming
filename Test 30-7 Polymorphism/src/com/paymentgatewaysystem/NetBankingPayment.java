package com.paymentgatewaysystem;

public class NetBankingPayment extends Payment{
    private String bankName;

    public NetBankingPayment(int transactionId, String customername, double amount, String bankName) {
        super(transactionId, customername, amount);
        this.bankName = bankName;
    }

    @Override
    void pay() {
        System.out.println("Processing Net Banking Payment...\n" +
                "Redirecting to Bank Portal...\n" +
                "Authenticating User Credentials...\n" +
                "Payment of ₹<amount> Successful using Net Banking.\n");
    }
}
