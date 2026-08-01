public class FibonacciSeries {
    public static void main(String[] args) {
        int n=5;
        int first=0,second=1,third=0;
        for(int i=1;i<=n;i++)
        {
            System.out.print(first+" ");
            third=first+second;
            first=second;
            second=third;
        }
    }
}
