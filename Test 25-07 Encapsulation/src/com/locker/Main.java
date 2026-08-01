package com.locker;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("===Locker===");
        System.out.print("Enter Locker Number: ");
        int lockernumber=sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Owner Name: ");
        String name=sc.nextLine();

        System.out.print("Enter Current password: ");
        String currentPassword=sc.nextLine();

        Locker locker=new Locker();
        locker.setLockerNumber(lockernumber);
        locker.setOwnerName(name);
        locker.setPassword(currentPassword);

        locker.verifyPassword(currentPassword);

        System.out.print("Enter New password: ");
        String newpassword=sc.nextLine();
        locker.changePassword(currentPassword,newpassword);

        locker.displayOwner();

//        System.out.println("======Details=======");
//        System.out.println("Locker Nummber: "+locker.getLockerNumber());
//        System.out.println("Locker OwnerName: "+locker.getOwnerName());
//        System.out.println("Curent Password: "+locker.getPassword());

    }
}
