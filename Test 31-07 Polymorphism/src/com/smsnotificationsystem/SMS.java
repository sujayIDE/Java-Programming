package com.smsnotificationsystem;

public class SMS extends Notification{

    public SMS(int notificationId, String recipientName, String message) {
        super(notificationId, recipientName, message);
    }

    @Override
    void sendNotification() {
        System.out.println("Sending SMS Notification...\n" +
                "Connecting to SMS Gateway...\n" +
                "Delivering Message...\n" +
                "SMS sent successfully...");

    }
}
