package com.array;

public class MaxSumSubArray {
    static void maxSumSubArray(int []arr,int k){
        int left=0;
        int right=0;
        int sum=0;
        int maxSum=0;
        while (right<arr.length)
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
        System.out.println(maxSum);
    }
    public static void main(String[] args) {
        int []arr={4,6,0,2,6,9,3,2,6,7,4,3,3,5,6,7,8};
        int k=4;
        maxSumSubArray(arr,k);
    }
}
