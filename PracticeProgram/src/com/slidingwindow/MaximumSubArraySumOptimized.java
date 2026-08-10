package com.slidingwindow;

public class MaximumSubArraySumOptimized {
    static int maxSum(int []arr,int k){
        int left=0;
        int right=0;
        int sum=0;
        int maxSum=0;

        while(right<arr.length){
            sum+=arr[right];
            
            if(right-left+1<k){
                right++;
            } else if (right-left+1==k) {
                maxSum=Math.max(maxSum,sum);
                sum=sum-arr[left];
                left++;
                right++;
            }
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int arr[]={2,5,1,8,2,9};
        int k=3;
        System.out.println(maxSum(arr,k));
    }
}
