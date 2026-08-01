package com.sujay.notification_system;

public class SMS_Notification implements Notification{
    @Override
    public void send(String input, String text) {
        System.out.println("Phone No: "+input);
        System.out.println("Text: "+text);
    }
}
