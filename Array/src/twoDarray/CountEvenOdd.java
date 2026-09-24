package twoDarray;

public class CountEvenOdd {
    public static void main(String[] args) {
        int[][] arr={
                { 10,20,30},
                {40,50,60},
                {70,80,90}
        };

        int evenCount=0;
        int oddCount=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                if(arr[i][j]%2==0)
                {
                    evenCount++;
                }else {
                    oddCount++;
                }
            }
        }
        System.out.println("Even Count : "+evenCount);
        System.out.println("Odd Count : "+oddCount);
    }
}
