package com.smsnotificationsystem;

public class PushNotification extends Notification{
    public PushNotification(int notificationId, String recipientName, String message) {
        super(notificationId, recipientName, message);
    }

    @Override
    void sendNotification() {
        System.out.println("Sending Push Notification...\n" +
                "Connecting to Notification Server...\n" +
                "Delivering Push Notification...\n" +
                "Push Notification sent successfully.");
    }

}
