package practice;

interface Calculate{
    int calculate(int a,int b);
}
public class Main {
    public static void main(String[] args) {
        Calculate sum=(a,b)->a+b;
        System.out.println("Sum : "+sum.calculate(10,20));

        Calculate minus=(a,b)->a-b;
        System.out.println("Minus : "+minus.calculate(20,10));

        Calculate multi=(a,b)->a*b;
        System.out.println("Multi : "+multi.calculate(10,20));

        Calculate division=(a,b)->a/b;
        System.out.println("Div : "+division.calculate(20,10));
    }
}
