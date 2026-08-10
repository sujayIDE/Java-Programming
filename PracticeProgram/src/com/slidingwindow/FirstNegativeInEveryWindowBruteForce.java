package com.slidingwindow;

public class FirstNegativeInEveryWindowBruteForce {
    static void firstNegative(int[]arr,int k)
    {
        for(int i=0;i<arr.length-k;i++)
        {
            boolean flag=false;
            for(int j=i;j<i+k;j++)
            {
                if(arr[j]<0)
                {
                    System.out.print(arr[j]+" ");
                    flag=true;
                    break;
                }
            }
        }
    }
    public static void main(String[] args) {
        int []arr={12,-1,-7,8,-16,30,16,28};
        int k=3;
        firstNegative(arr,k);
    }
}
