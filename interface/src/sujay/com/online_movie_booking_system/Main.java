package sujay.com.online_movie_booking_system;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("----Online Movie Booking System----");
        System.out.println("1.regular booking");
        System.out.println("2.premium booking");
        System.out.print("Enter your choice: ");
        int choice=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter customer name: ");
        String cname=sc.nextLine();
        System.out.println("Enter movie name: ");
        String movie_name=sc.nextLine();

        switch (choice)
        {
            case 1:
                RegularBooking rb=new RegularBooking(101,cname,movie_name,250);
                System.out.println(rb);
                rb.ticketBooking();
                rb.generateReceipt();
                break;

            case 2:
                System.out.println("Enter Seat Type: ");
                String seat_type=sc.nextLine();
                PremiumBooking pb=new PremiumBooking(1001,cname,movie_name,450,seat_type);
                System.out.println(pb);
                pb.ticketBooking();
                pb.generateReceipt();
                pb.loungrAccess();
                break;

            default:
                System.out.println("Invalid Choice...");
        }


    }
}
