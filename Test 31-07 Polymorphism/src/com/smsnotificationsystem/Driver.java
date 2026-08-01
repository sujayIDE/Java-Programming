package com.smsnotificationsystem;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Notification n;
        SMS sms;
        Email email;
        PushNotification pushNotification;

        ArrayList<Notification> notifications=new ArrayList<>();

        System.out.println("Enter Receipt Name: ");
        String name=sc.nextLine();

        System.out.println("Enter message: ");
        String message=sc.nextLine();

        System.out.println("Types: ");
        System.out.println("1.SMS");
        System.out.println("2.Email");
        System.out.println("3.PushNotification");

        System.out.println("Enter choice: ");
        int choice=sc.nextInt();
        sc.nextLine();

        switch (choice)
        {
            case 1:
                sms=new SMS(1111111,name,message);
                notifications.add(sms);
                break;

            case 2:
                email=new Email(2222222,name,message);
                notifications.add(email);
                break;

            case 3:
                pushNotification=new PushNotification(333333,name,message);
                notifications.add(pushNotification);
                break;

            default:
                System.out.println("Enter valid choice....");
        }

        Iterator<Notification> notificationIterator=notifications.iterator();
        while (notificationIterator.hasNext())
        {
             n=notificationIterator.next();
            //System.out.println(n);
            n.displayNotificationDetails();
            System.out.println();
            n.sendNotification();
        }
    }
}
