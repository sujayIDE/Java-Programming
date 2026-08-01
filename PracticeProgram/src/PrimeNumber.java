import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       while (true)
       {
           System.out.println("Enter number: ");
           int num=sc.nextInt();

           boolean flag=true;
           for(int i=2;i<=Math.sqrt(num);i++)
           {
               if(num%i==0)
               {
                   flag=false;
                   break;
               }
           }

           if(flag)
           {
               System.out.println("Prime number");
           }else
               System.out.println("Not Prime number");
       }
       }
}
