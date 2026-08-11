package com.smartParkingGate;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Vehicle Number : ");
        int vehicleNumber=sc.nextInt();

        System.out.println("Enter status : ");
        int status=sc.nextInt();

        ParkingGate parkingGate=new ParkingGate(vehicleNumber,status);
        switch (status) {

            case 0:
                parkingGate.detectVehicle();
                break;

            case 1:
                parkingGate.completePayment();
                break;

            case 2:
                parkingGate.identifyVIP();
                break;

            case 4:
                parkingGate.openGate();
                break;

            default:
                System.out.println("Invalid status");
        }

        parkingGate.displayStatus();
    }
}
