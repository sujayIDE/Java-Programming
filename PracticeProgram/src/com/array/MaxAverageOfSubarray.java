package com.array;

import java.util.Arrays;

public class MaxAverageOfSubarray {
    static void maxAverage(int []arr,int k)
    {
        int left=0;
        int right=0;
        int sum=0;
        double avg=0;
        double maxAvg=0;
        while (right<arr.length)
        {
            sum+=arr[right];
            if(right-left+1<k)
            {
                right++;
            } else if (right-left+1==k) {
                avg=(double) sum/k;
                maxAvg=Math.max(avg,maxAvg);
                sum-=arr[left];
                left++;
                right++;
            }
        }
        System.out.println(maxAvg);
    }
    public static void main(String[] args) {
        int []arr={1,12,-5,-6,50,3};
        int k=4;
        maxAverage(arr,k);
    }
}
