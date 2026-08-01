import java.util.Scanner;

class Ride{
   double calculateFare(double distance)
   {
      return 0;
   }
}

class MiniRide extends Ride{
    int rate=12;
    double calculateFare(double distance)
    {
        return distance*rate;
    }
}

class SedanRide extends Ride{
    int rate=18;
    double calculateFare(double distance)
    {
        return distance*rate;
    }
}

class SuvRide extends Ride{
    int rate=25;
    double calculateFare(double distance)
    {
        return distance*rate;
    }
}
public class Ride_Booking_Apllication {
    public static void main(String[] args) {
        Ride ride=new MiniRide();
        Ride ride1=new SedanRide();
        Ride ride2=new SuvRide();
        Scanner sc=new Scanner(System.in);
        System.out.println("======Ride_Booking_Application======");
        System.out.println("1.Mini");
        System.out.println("2.Sedan");
        System.out.println("3.Suv");
        System.out.println("Enter Choice: ");
        int choice=sc.nextInt();
        sc.nextLine();
        double totalFare=0;
        switch (choice)
        {
            case 1:
                System.out.println("Enter Distance: ");
                int km=sc.nextInt();
                 totalFare=ride.calculateFare(km);
                break;

            case 2:
                System.out.println("Enter Distance: ");
                int km1=sc.nextInt();
                totalFare= ride1.calculateFare(km1);
                break;

            case 3:
                System.out.println("Enter Distance: ");
                int km2=sc.nextInt();
               totalFare= ride2.calculateFare(km2);
                break;

            default:
                System.out.println("Invalid Choice");
                break;
        }

        System.out.println("TatalFare: "+totalFare);
    }
}
