package com.vehiclehierarchysystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Vehicle type...");
        System.out.println("1.Car");
        System.out.println("2.Bike");

        System.out.print("Enter choice: ");
        int choice= scanner.nextInt();

        switch (choice)
        {
            case 1:
                Vehicle vehicle=new Car("Toyota","Fortuner");
                vehicle.displayInfo();
                break;

            case 2:
                Vehicle vehicle1=new Bike("Royal Enfield","Classic 360");
                vehicle1.displayInfo();
                break;

            default:
                System.out.println("Enter valid choice...");
        }
    }
}
