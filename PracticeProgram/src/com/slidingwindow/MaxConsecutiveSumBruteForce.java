package com.slidingwindow;

public class MaxConsecutiveSumBruteForce {
    static void maxConsecutiveSum(int []arr,int k)
    {
        int maxSum=0;
       for(int i=0;i<arr.length-k;i++)
       {
           int sum=0;
           for(int j=i;j<i+3;j++)
           {
               sum+=arr[j];
           }

           if(sum>maxSum)
           {
               maxSum=sum;
           }
       }
        System.out.println("MaxSum: "+maxSum);
    }
    public static void main(String[] args) {
        int[] arr={-1,4,3,6,8,4,-1};
        int k=3;
        maxConsecutiveSum(arr,k);

    }
}
