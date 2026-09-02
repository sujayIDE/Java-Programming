package normal.pattern;

public class IncreasingDecreasingStar {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int j=n-1;j>0;j--)
        {
            for(int k=1;k<=j;k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
