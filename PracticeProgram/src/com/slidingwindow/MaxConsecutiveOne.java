package com.slidingwindow;

public class MaxConsecutiveOne {
    static void maxOne(int[] nums)
    {
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            for(int j=0;j<nums.length;j++)
            {
                if(nums[i]!=nums[j])
                {
                    count=0;
                }else {
                    count++;
                }
            }
        }
        System.out.println("Count : "+count);
    }

    public static void main(String[] args) {
        int []nums={1,1,1,0,1,1,1,1,0};
        maxOne(nums);
    }
}
