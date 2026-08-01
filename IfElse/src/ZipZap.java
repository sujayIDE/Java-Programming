import java.util.Scanner;

public class ZipZap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number: ");
        int num=sc.nextInt();
        if(num%3== 0 && num%5==0)
        {
            System.out.println("War");
        } else if (num%3==0) {
            System.out.println("zip");
        } else if (num%5==0) {
            System.out.println("Zap");
        }else
            System.out.println("Jar");
    }
}
