public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("Fibonacci series to print 1 to N");
        int n=10;
        int num1=0,num2=1,num3=0;
        for(int i=1;i<=n;i++)
        {
            System.out.print(num1+" ");
            num3=num1+num2;
            num1=num2;
            num2=num3;
        }
    }
}
