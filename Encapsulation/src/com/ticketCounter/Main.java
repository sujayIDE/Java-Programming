package com.ticketCounter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter seat Number :");
        int seatNumber=sc.nextInt();

        System.out.println("Enter Ticket Price :");
        double tickerPrice=sc.nextDouble();

        Movie movie=new Movie(tickerPrice,seatNumber);
        movie.bookTicket();
        Movie.getRevenue();
        movie.cancelTicket();
        movie.display();
    }
}
