package com.securedigitalvault;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        DigitalVault digitalVault=new DigitalVault("Vault@123","Java.pdf",1234);

        System.out.print("Enter Password: ");
        String password=sc.nextLine();

        System.out.print("Enter SecurityCode: ");
        int securityCode=sc.nextInt();
        sc.nextLine();

        digitalVault.authenticate(password,securityCode);
//
//        System.out.println("Enter New Password: ");
//        String newPassword=sc.nextLine();

        //digitalVault.changePassword(password,newPassword);

    }
}
