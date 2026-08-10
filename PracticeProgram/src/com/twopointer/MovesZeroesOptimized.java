package com.twopointer;

import java.util.Arrays;

public class MovesZeroesOptimized {
    static void movesZeroes(int []nums)
    {
        int left=0;
        int right=0;
        while(right<nums.length)
        {
            if(nums[right]!=0)
            {
                int temp=nums[right];
                nums[right]=nums[left];
                nums[left]=temp;
                left++;
            }
            right++;
        }

        System.out.println(Arrays.toString(nums));
    }
    public static void main(String[] args) {
        int []arr={0,1,0,3,12};
        movesZeroes(arr);
    }
}
