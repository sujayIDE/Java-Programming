import java.util.Scanner;

public class SumOfDigitOfNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (true)
        {
            int sum=0;
            System.out.println("Enter number");
            int num=sc.nextInt();

           while(num>0)
           {
               int digit=num%10;
               sum+=digit;
               num=num/10;
           }

            System.out.println(sum);



        }
    }
}
