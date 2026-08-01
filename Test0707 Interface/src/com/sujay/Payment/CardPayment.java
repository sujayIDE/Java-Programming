package com.sujay.Payment;

public class CardPayment implements Payment,Reciept{
    private int transaction_id;
    private String customerName;
    private double amount;
    private String cardType;

    public CardPayment(int transaction_id, String customerName, double amount, String cardType) {
        this.transaction_id = transaction_id;
        this.customerName = customerName;
        this.amount = amount;
        this.cardType = cardType;
    }

    @Override
    public void processPayment() {
        System.out.println("card payment has been processed successfully.");
    }

    @Override
    public void generateReciept() {
        System.out.println("======Card Payment Reciept===========");
        System.out.println("Transaction ID: "+transaction_id);
        System.out.println("Customer Name: "+customerName);
        System.out.println("Amount "+amount);
        System.out.println("Card Type: "+cardType);
    }

    @Override
    public String toString() {
        return "--------CARD PAYMENT--------------"+"\n"+"Transaction_ID:"+transaction_id+"\n"+"Customer_name:"+customerName+"\n"+"Amount:"+amount+"\n"+"Card_Type:"+cardType;
    }
}
