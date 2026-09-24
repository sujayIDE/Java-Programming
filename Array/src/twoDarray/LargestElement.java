package twoDarray;

public class LargestElement {
    public static void main(String[] args) {
        int[][] arr={
            { 10,20,30},
            {40,50,60},
                {70,80,90}
        };
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                if(arr[i][j]>max)
                {
                    max=arr[i][j];
                }
            }
        }
        System.out.println("Max : "+max);
    }
}
