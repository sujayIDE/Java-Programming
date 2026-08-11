package com.twopointer;

public class MaximumWaterBruteForce {
    static void maxWater(int []nums)
    {
        int maxArea=0;
        for(int i=0;i<nums.length-1;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                int height=Math.min(nums[i],nums[j]);
                int width=j-i;
                int area=height*width;
                maxArea=Math.max(area,maxArea);
            }
        }
        System.out.println(maxArea);
    }
    public static void main(String[] args) {
        int [] nums={1,8,6,2,5,4,8,3,7};
        maxWater(nums);
    }
}
