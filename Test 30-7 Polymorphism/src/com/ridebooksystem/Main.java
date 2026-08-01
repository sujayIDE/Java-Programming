package com.ridebooksystem;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        BikeRide bikeRide;
        CarRide carRide;
        AutoRide autoRide;
        ArrayList<Ride> rideArrayList=new ArrayList<>();

        System.out.println("Enter Customer Name: ");
        String name=scanner.nextLine();

        System.out.println("Enter pickup: ");
        String picUp=scanner.nextLine();

        System.out.println("Enter Destination: ");
        String destination=scanner.nextLine();

        System.out.println("Enter Distance (km): ");
        int distance=scanner.nextInt();
        scanner.nextLine();

        System.out.println("Vehicle type: ");
        System.out.println("1.Bike");
        System.out.println("2.Car");
        System.out.println("3.Auto");
        System.out.println("Enter vehicle type: ");
        int choice=scanner.nextInt();
        scanner.nextLine();

        switch (choice)
        {
            case 1:
                bikeRide=new BikeRide(10101,name,picUp,destination,distance);
                rideArrayList.add(bikeRide);
                break;

            case 2:
               carRide= new CarRide(20202,name,picUp,destination,distance);
                rideArrayList.add(carRide);
                break;

            case 3:
                autoRide=new AutoRide(3030303,name,picUp,destination,distance);
                rideArrayList.add(autoRide);
                break;

            default:
                System.out.println("Enter valid choice....");
        }

        Iterator<Ride> rideIterator=rideArrayList.iterator();
        while(rideIterator.hasNext()){
            Ride e=rideIterator.next();

        }
    }
}
