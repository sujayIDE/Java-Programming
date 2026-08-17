package com.slidingwindow;

public class MaximumSumSubArray {
    static void maxSum(int[] arr,int k)
    {
        int left=0;
        int right=0;
        int sum=0;
        int maxSum=0;
        while(right<arr.length)
        {
            sum+=arr[right];
            if(right-left+1<k)
            {
                right++;
            } else if (right-left+1==k) {
                maxSum=Math.max(sum,maxSum);
                sum-=arr[left];
                left++;
                right++;
            }
        }

        System.out.println("MaxSum : "+maxSum);
    }
    public static void main(String[] args) {
        int []arr={1,4,2,10,23,3,1,0,20};
        int k=4;
        maxSum(arr,k);
    }
}
