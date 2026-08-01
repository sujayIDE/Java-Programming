import java.util.Scanner;

public class ProblemStatement2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value for a:");
        int a=sc.nextInt();
        System.out.println("Enter value for b:");
        int b=sc.nextInt();
        if(a==b){
            System.out.println("Addition:" +(a+b));
        } else if (a!=b) {
            System.out.println("Multiplication:"+(a*b));
        }else {
            System.out.println("Invalid Input");
        }
    }
}
