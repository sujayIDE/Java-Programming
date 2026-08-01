import java.util.Scanner;

public class OddPositionSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number: ");
        int num=sc.nextInt();
        int temp=num;
        int count=0;
        while(temp>0)
        {
            temp/=10;
            count++;
        }

        int temp2=num;
        int sum=0;
        while(temp2>0)
        {
            int lastdigit=temp2%10;
            if(count%2!=0)
            {
                sum+=lastdigit;
            }
            temp2/=10;
            count--;
        }
        System.out.println("Sum of odd position is: "+sum);
    }
}
