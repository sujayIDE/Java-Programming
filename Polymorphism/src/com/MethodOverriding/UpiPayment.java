package com.MethodOverriding;

public class UpiPayment extends Payment{
    private String upiId;

    UpiPayment(String upiId)
    {
        this.upiId=upiId;
    }

    @Override
    public void pay()
    {
        System.out.println("Upi Payment done: "+upiId);
    }
}
