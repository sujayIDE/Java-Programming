import java.util.Scanner;

public class PrimeNumberOptimized {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number: ");
        int n=sc.nextInt();

        boolean flag=true;
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
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
