import java.util.Scanner;

public class SmartParking {
    public static void main(String[] args) {
        System.out.println("====Smart Parking===");
        System.out.println("1.Bike : 20/hour");
        System.out.println("2.Car  : 50/hour");
        System.out.println("3.Bus  : 100/hour");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of vehicles: ");
        int n = sc.nextInt();

        double totalCollection = 0;

        for (int i = 1; i <= n; i++) {
            System.out.println("Vehicle " + i);

            System.out.print("Type (1-3) 1.bike 2.car 3.bus: ");
            int type = sc.nextInt();

            System.out.print("Hours: ");
            int hours = sc.nextInt();

            System.out.print("Paid Subscription? (1 for Yes, 0 for No): ");
            int subscription = sc.nextInt();

            int rate = 0;

            switch (type) {
                case 1:
                    rate = 20;
                    break;

                case 2:
                    rate = 50;
                    break;

                case 3:
                    rate = 100;
                    break;
            }

            double bill = hours * rate;

            if (hours > 8) {
                bill = bill - (bill * 10 / 100);
            }

            if (subscription == 1) {
                bill = bill - (bill * 5 / 100);
            }

            System.out.println("Vehicle "+type+" bill "+bill);
            totalCollection += bill;
            System.out.println("TotalCollection: "+totalCollection);
        }


    }
}