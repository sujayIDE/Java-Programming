package com.array;

public class MaxConsecutiveOnes {
    static void maxOnes(int []nums)
    {
        int left=0;
        int right=0;
        int count=0;
        int max=0;
        int element=0;
        while(right<nums.length)
        {
            if(nums[left]==nums[right])
            {
                right++;
            }else {
                count=right-left;

                if(count>max)
                {
                    max=count;
                    element=nums[right];
                }
                left=right;
            }
        }
        System.out.println(max);
    }
    public static void main(String[] args) {
        int nums[]={1,1,0,1,1,1};
        maxOnes(nums);
    }
}
