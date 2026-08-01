package com.sujay.Payment;

public class Main {
    public static void main(String[] args) {
        UpiPayment upiPayment =new UpiPayment(121,"Rohit",45000.0);
//        Payment payment=upiPayment;
//        Reciept reciept=upiPayment;
        System.out.println(upiPayment.toString());
        upiPayment.processPayment();
        upiPayment.generateReciept();

        System.out.println("==============================================");
        System.out.println();

        CardPayment cardPayment=new CardPayment(101,"Rohit",45000.0,"RuPay");
        Payment payment1=cardPayment;
        Reciept reciept1=cardPayment;
        System.out.println(cardPayment.toString());
        payment1.processPayment();
        reciept1.generateReciept();


    }
}
