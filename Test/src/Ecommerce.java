import java.util.Scanner;

public class Ecommerce {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================");
        System.out.println("Ecommerce Website");
        System.out.println("=================");
        System.out.println("Enter Purchase Amount:");
        int purchaseAmount=sc.nextInt();

        int lastBill;
        if(purchaseAmount>5000 && purchaseAmount<10000)
        {
            lastBill=purchaseAmount-(purchaseAmount*10)/100;
            System.out.println("Total bill with discount: "+lastBill);
        } else if (purchaseAmount>10000 && purchaseAmount<20000) {
            lastBill=purchaseAmount-(purchaseAmount*20)/100;
            System.out.println("Total bill with discount: "+lastBill);
        } else if (purchaseAmount>20000) {
            lastBill=purchaseAmount-(purchaseAmount*30)/100;
            System.out.println("Total bill with discount: "+lastBill);
        }
    }
}
