import java.util.Scanner;

public class ParkingFee {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int hours=sc.nextInt();
        int fee=0;
        if(hours<=2)
        {
            fee=20;
        } else {
            fee=20+(hours-2)*10;
        }
        if (fee>200) {
            fee=200;
        }
        System.out.println("Parking fee: "+fee);
    }
}
