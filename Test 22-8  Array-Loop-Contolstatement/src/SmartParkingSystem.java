import java.util.Scanner;

public class SmartParkingSystem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Total Parking Slot : ");
        int totalParkingSlot=sc.nextInt();
        sc.nextLine();

        int emptySlot=0;
        int occupiedSlot =0;
        for(int i=0;i<totalParkingSlot;i++)
        {
            char ch=sc.next().charAt(0);
            if(ch=='E')
            {
                emptySlot++;
            }else {
                occupiedSlot++;
            }
        }
        System.out.println(emptySlot);
        System.out.println(occupiedSlot);
        int parkingAvailabilty=(emptySlot/totalParkingSlot)*100;

        System.out.println("EmptySlot : "+emptySlot);
        System.out.println("Occupied Slot : "+occupiedSlot);
        System.out.println("Parking Availability : "+parkingAvailabilty+"%");
    }
}
