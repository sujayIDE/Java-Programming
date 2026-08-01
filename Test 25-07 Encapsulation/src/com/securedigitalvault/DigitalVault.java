package com.securedigitalvault;

import java.util.Scanner;

public class DigitalVault {
    Scanner sc=new Scanner(System.in);
    private String vaultPassword;
    private final String document;
    private int vaultsecuritycode;

    public DigitalVault(String vaultPassword, String document, int vaultsecuritycode) {
        this.vaultPassword = vaultPassword;
        this.document = document;
        this.vaultsecuritycode = vaultsecuritycode;
    }

//    public void setVaultPassword(String vaultPassword) {
//        this.vaultPassword = vaultPassword;
//    }
//
//    public void setVaultsecuritycode(int vaultsecuritycode) {
//        this.vaultsecuritycode = vaultsecuritycode;
//    }

    private boolean vaultLocked=false;

    int failedAttempt=0;

    void authenticate(String password,int securitycode)
    {
        if(vaultLocked)
        {
            System.out.println("Permanently locked....");
            return;
        }
        if(password.equals(vaultPassword) && securitycode==vaultsecuritycode)
        {
            System.out.println("Authentication Successful...");
            System.out.println("Access Granted...");
            viewDocument();
        }else
        {
            failedAttempt++;
            System.out.println("Access denied..."+failedAttempt);
            if(failedAttempt<3)
            {
                System.out.print("Enter Password: ");
                String fpassword=sc.nextLine();
                System.out.print("Enter SecuritCode: ");
                int fsecurityCode=sc.nextInt();
                sc.nextLine();
                authenticate(fpassword,fsecurityCode);
            }
            else {
                isvaultLocked();
            }
        }
    }

    void viewDocument()
    {
        System.out.println(document);
    }

    void changePassword(String currentPassword, int securityCode, String newPassword)
    {
        if(vaultPassword.equals(currentPassword) &&
                vaultsecuritycode == securityCode)
        {
            vaultPassword = newPassword;
            System.out.println("Password changed successfully.");
        }
        else
        {
            System.out.println("Authentication failed.");
        }
    }

    void isvaultLocked()
    {
            vaultLocked=true;
            System.out.println("Vault Locked...");
    }
}
