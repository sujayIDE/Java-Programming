package com.sujay.notification_system;

public class Email_Notification implements Notification{
    @Override
    public void send(String input, String text) {
        System.out.println("Email: "+input);
        System.out.println("Text: "+text);
    }
}
