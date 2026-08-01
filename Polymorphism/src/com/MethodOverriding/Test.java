package com.MethodOverriding;

public class Test {
    public static void main(String[] args) {
       PaymentService ps=new PaymentService();
       ps.processPayment(new CardPayment("434344344343"));
       ps.processPayment(new UpiPayment("sujay@sbi"));
    }
}
