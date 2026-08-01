package com.MethodOverriding;

public class CardPayment extends Payment{
    private String cardNumber;

    public CardPayment(String cardNumber)
    {
        this.cardNumber=cardNumber;
    }

    @Override
    public void pay()
    {
        System.out.println("CardPayment done "+cardNumber);
    }
}
