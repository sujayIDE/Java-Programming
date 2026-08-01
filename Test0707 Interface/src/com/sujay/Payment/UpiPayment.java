package com.sujay.Payment;

public class UpiPayment implements Payment,Reciept{
    private int transaction_id;
    private String customerName;
    private double amount;

    public UpiPayment(int transaction_id, String customerName, double amount) {
        this.transaction_id = transaction_id;
        this.customerName = customerName;
        this.amount = amount;
    }

    @Override
    public void processPayment() {
        System.out.println("payment has been processed successfully using UPI.\n");
    }

    @Override
    public void generateReciept() {
        System.out.println("=======Upi Payment Reciept=======");
        System.out.println("TransactionID: "+transaction_id);
        System.out.println("Customer Name: "+customerName);
        System.out.println("Amount: "+amount);
    }

    @Override
    public String toString() {
        return "------UPI PAYMENT-------"+"\n"+"Transaction_ID:"+transaction_id+"\n"+"Customer_name:"+customerName+"\n"+"Amount:"+amount;
    }
}
