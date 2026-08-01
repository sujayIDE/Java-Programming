import java.util.Arrays;

public class Best_Time_Buy_Sell_stock {
    static void max_profit(int arr[])
    {
       int max_profit=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j]-arr[i]>max_profit)
                {
                    max_profit=arr[j]-arr[i];
                }
            }
        }

        System.out.println("maxProfit: "+max_profit);
    }
    public static void main(String[] args) {
        int arr[]={7,1,5,3,6,4};
        max_profit(arr);
    }
}
