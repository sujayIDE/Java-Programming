import java.util.Scanner;

public class DeliveryCharges {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter km: ");
        int km=sc.nextInt();
        int delivery;
        if(km<=3)
        {
            delivery=0;
        } else if (km<=6) {
            delivery=(km-3)*12;
        }else
            delivery=36+(km-6)*18;

        System.out.println("Delivery fee: "+delivery);
    }
}
