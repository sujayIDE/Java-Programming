package com.onlineshopping;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        OnlineShopping onlineShopping=new OnlineShopping("abc@123","abc@123",1000,false,0);

        while (true)
        {
            System.out.println("Enter Username: ");
            String username= scanner.nextLine();

            System.out.println("Enter Password: ");
            String password=scanner.nextLine();

            if(onlineShopping.login(username,password))
            {
                System.out.println("Login successful...");
                break;
            }

            if(onlineShopping.isLocked())
            {
                System.out.println("Locked...");
                return;
            }
        }

        System.out.println("Enter Amount: ");
        int addAmount= scanner.nextInt();
        onlineShopping.addMoney(addAmount);
    }
}
