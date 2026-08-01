import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       while (true)
       {
           System.out.println("Enter number: ");
           int num=sc.nextInt();
           int sum=0;
           for(int i=0;i<=num/2;i++)
           {
               if(num%i==0)
               {
                   sum+=i;
               }
           }
           if(num==sum)
           {
               System.out.println("perfect number");
           }else{
               System.out.println("not perfect");
           }
       }
    }
}
