package com.array;

import java.util.ArrayList;
import java.util.Arrays;

public class ThreeSum {
    static void threeSum(int [] nums)
    {
        Arrays.sort(nums);
        ArrayList<Integer> result=new ArrayList<>();

        for(int i=0;i<nums.length-2;i++)
        {
            if(i>0 && nums[i]==nums[i-1])
            {
                continue;
            }
            int left=i+1;
            int right=nums.length-1;

            while (left<right)
            {
                int sum=nums[i]+nums[left]+nums[right];
                if(sum==0)
                {
                    result.add(Arrays.asList(nums[i],nums[left],nums[right]));
                }
            }
        }
    }
    public static void main(String[] args) {
        int []nums={-1,0,1,2,-1,-4};
        ThreeSum threeSumOptimized=new ThreeSum();
        System.out.println(threeSumOptimized.threeSum(nums));
    }
}
