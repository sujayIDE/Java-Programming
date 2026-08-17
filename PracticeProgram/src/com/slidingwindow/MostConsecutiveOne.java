package com.slidingwindow;

public class MostConsecutiveOne {
    static void maxOneCount(int[] nums)
    {
        int right=0;
        int count=0;
        int maxCount=0;
        while(right<nums.length)
        {
           if(nums[right]==1)
           {
               count++;
           } else if (nums[right]!=1) {
              maxCount= Math.max(count,maxCount);
               count=0;
           }
           right++;
        }
    int max=Math.max(count,maxCount);
        System.out.println(max);
    }
    public static void main(String[] args) {
        int []nums={1,1,1,0,1,1,1,1};
        maxOneCount(nums);
    }
}
