package onlinebookingsystem;

public class OnlineBooking {
    private static int total_available_seats=5;

    public static int getTotal_available_seats() {
        return total_available_seats;
    }

    public static void setTotal_available_seats(int total_available_seats) {
        OnlineBooking.total_available_seats = total_available_seats;
    }

     synchronized static void onlineBooking(int book_seats)
    {
        if(book_seats<=0)
        {
            throw new InvalidSeatException("Invalid Seat.......for ->"+Thread.currentThread().getName());
        }
        if(book_seats>total_available_seats)
        {
            throw new NotEnoughSeatsException("Not enough seats....for -> "+Thread.currentThread().getName());
        }
        System.out.println("Current thread is : "+Thread.currentThread().getName());
        System.out.println("Available seats are : "+total_available_seats);
        int remaining_seats=total_available_seats-book_seats;
        setTotal_available_seats(remaining_seats);
        System.out.println("Seat booked by : "+Thread.currentThread().getName() +"->"+book_seats);
    }
    public static void main(String[] args) {

        Thread thread1=new Thread(
                ()->{
            try{
                onlineBooking(2);
            }catch (NotEnoughSeatsException | InvalidSeatException n)
            {
                System.out.println(n.getMessage());
            }
        });

       Thread thread2=new Thread(()->{
           try{
               onlineBooking(1);
           }catch (NotEnoughSeatsException | InvalidSeatException n)
           {
               System.out.println(n.getMessage());
           }
       });

        Thread thread3=new Thread(
                ()->{
                    try{
                        onlineBooking(4);
                    }catch (NotEnoughSeatsException | InvalidSeatException n)
                    {
                        System.out.println(n.getMessage());
                    }
                });

        Thread thread4=new Thread(
                ()->{
                    try{
                        onlineBooking(2);
                    }catch (NotEnoughSeatsException | InvalidSeatException n)
                    {
                        System.out.println(n.getMessage());
                    }
                });
        thread1.setName("Thread 1");
        thread2.setName("Thread 2");
        thread3.setName("Thread 3");
        thread4.setName("Thread 4");
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }
}
