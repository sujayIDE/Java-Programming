package twoDarray;

public class RowWithMaxSum {
    public static void main(String[] args) {
        int[][] arr = {
                {10, 20, 30},
                {40, 50, 60},
                {70, 80, 90}
        };

        int sum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            sum=0;
            for(int j=0;j<arr[i].length;j++)
            {
                sum+=arr[i][j];
            }
            if(sum>maxSum)
            {
                maxSum=sum;
            }
        }
        System.out.println("Max Sum Row : "+maxSum);
    }
}
