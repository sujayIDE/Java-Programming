package nonstaticinnerclass.movieticketavailability;

import java.util.Scanner;

public class MovieShow {
    String movieName;
    int availableSeats;

    public MovieShow(String movieName, int availableSeats) {
        this.movieName = movieName;
        this.availableSeats = availableSeats;
    }

    class Booking{
        void bookSeats(int seats)
        {
            if(seats<=availableSeats)
            {
                System.out.println("Seats are available...");
            }
            availableSeats-=seats;
            System.out.println("Booking successful....");
            System.out.println("Booking seats : "+seats);
            System.out.println("Remaining seats : "+availableSeats);
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Movie name: ");
        String name=sc.nextLine();

        System.out.println("Enter available seats : ");
        int availableSeats=sc.nextInt();

        System.out.println("Enter Booking Seats : ");
        int seats=sc.nextInt();

        MovieShow movieShow=new MovieShow(name,availableSeats);
        MovieShow.Booking mb=movieShow.new Booking();
        mb.bookSeats(seats);
    }
}
