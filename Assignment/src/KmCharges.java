import java.util.Scanner;

public class KmCharges {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Km:" );
        int km=sc.nextInt();
        int price=0;

        if(km<=3)
        {
            price=0;
            System.out.println("Free Delivery");
        } else if (km<=6) {
            price=(km-3)*12;
        }else{
            price=36 + (km-6) *18;
        }
        System.out.println(price);
    }
}
