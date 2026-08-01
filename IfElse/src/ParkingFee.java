import java.util.Scanner;

public class ParkingFee {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Hours: ");
        int hours=sc.nextInt();
        int parkingFee;

        if(hours<=2)
        {
            parkingFee=20;
        }else
            parkingFee=20+(hours-2)*10;
        if(parkingFee>=200)
        {
            parkingFee=200;
        }

        System.out.println("Parking fee: "+parkingFee);
    }
}
