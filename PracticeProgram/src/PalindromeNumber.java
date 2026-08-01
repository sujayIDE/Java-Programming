import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int num=sc.nextInt();
        int temp=num;
        int reverse=0;
        while (temp>0)
        {
            int lastDigit=temp%10;
            reverse=(reverse*10)+lastDigit;
            temp=temp/=10;
        }

        if(reverse==num)
        {
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not Palindrome");
        }
    }
}
