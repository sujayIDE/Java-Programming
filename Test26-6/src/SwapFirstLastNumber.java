import java.util.Scanner;

public class SwapFirstLastNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int num=sc.nextInt();
        int temp=num;
        int count=0;
        while (temp>0)
        {
            temp/=10;
            count++;
        }
        int arr[]=new int[count];

        temp=num;
        for(int i=count-1;i>=0;i--)
        {
            arr[i]=temp%10;
            temp/=10;
        }

        int swap=arr[0];
        arr[0]=arr[count-1];
        arr[count-1]=swap;

        int result=0;
        for(int i=0;i<count;i++)
        {
            result=result*10+arr[i];
        }
        System.out.println("After Swap: "+result);
    }
}
