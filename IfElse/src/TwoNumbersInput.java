import java.util.Scanner;

public class TwoNumbersInput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1=sc.nextInt();
        System.out.println("Enter second number: ");
        int num2=sc.nextInt();
        
        if(num1<0 && num2<0)
        {
            System.out.println("Invalid input");
        } else if ((num1>0 && num2>0) && (num1==num2)) {
            System.out.println("Addition: "+(num1+num2));
        }else
            System.out.println("Multiplication: "+(num1*num2));
    }
}
