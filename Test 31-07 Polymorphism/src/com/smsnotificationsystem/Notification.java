package com.smsnotificationsystem;

public class Notification {
    private int notificationId;
    private String recipientName;
    private String message;

    public Notification(int notificationId, String recipientName, String message) {
        this.notificationId = notificationId;
        this.recipientName = recipientName;
        this.message = message;
    }

    void displayNotificationDetails(){
        System.out.println("Notification Id :"+notificationId);
        System.out.println("Recipient Name  :"+recipientName);
        System.out.println("Message         :"+message);
    }

    void sendNotification(){
        System.out.println("Send notification......");
    }

}
