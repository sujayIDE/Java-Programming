package com.sujay.notification_system;

public class Main {
    public static void main(String[] args) {
        Notification_System notificationSystem=new Notification_System();
        notificationSystem.sendNotificationSystem(new Email_Notification(),"sujay@gmail.com","You got selected");
        System.out.println("=============================================================");
        notificationSystem.sendNotificationSystem(new SMS_Notification(),"8975132553","Alert: heavy rain in two days");
    }
}
