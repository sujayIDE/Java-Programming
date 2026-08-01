package com.smsnotificationsystem;

public class Email extends Notification{

    public Email(int notificationId, String recipientName, String message) {
        super(notificationId, recipientName, message);
    }

    @Override
    void sendNotification() {
        System.out.println("\n" +
                "Sending Email Notification...\n" +
                "Connecting to Mail Server...\n" +
                "Sending Email...\n" +
                "Email sent successfully.");
    }

}
