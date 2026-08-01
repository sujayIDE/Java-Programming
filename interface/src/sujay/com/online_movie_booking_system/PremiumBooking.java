package sujay.com.online_movie_booking_system;

public class PremiumBooking implements Booking,Reciept,PremiumFeature{
    private int bookingId;
    private String customerName;
    private String movieName;
    private int ticketPrice;
    private String seatType;

    public PremiumBooking(int bookingId, String customerName, String movieName, int ticketPrice, String seatType) {
        this.bookingId = bookingId;
        this.customerName = customerName;
        this.movieName = movieName;
        this.ticketPrice = ticketPrice;
        this.seatType = seatType;
    }

    @Override
    public void ticketBooking() {
        System.out.println("Premium Ticket Booked Successfully.");
    }

    @Override
    public void generateReceipt() {
        System.out.println("Receipt Generated..............");
        System.out.println("Booking Id :"+bookingId);
        System.out.println("Customer Name :"+customerName);
        System.out.println("Movie Name :"+movieName);
        System.out.println("Seat Type :"+seatType);
        System.out.println("Ticket Price :"+ticketPrice);
    }

    @Override
    public void loungrAccess() {
        System.out.println("Lounge Access Granted.");
    }

    @Override
    public String toString() {
        return "=====Premium Booking Details======"+"\n"+
                "Booking_Id: "+bookingId+"\n"+
                "Customer_Name: "+customerName+"\n"+
                "Movie_Name: "+movieName+"\n"+
                "Ticket_Price: "+ticketPrice+"\n"+
                "Seat_Type: "+seatType;
    }
}
