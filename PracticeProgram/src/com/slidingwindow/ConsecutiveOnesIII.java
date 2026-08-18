package com.slidingwindow;

public class ConsecutiveOnesIII {
    static void maxCount(int[]nums,int k)
    {
        int maxLength=0;
        for(int left=0;left<nums.length;left++)
        {
            int countZero=0;
            for(int right=left;right<nums.length;right++)
            {
                if(nums[right]==0)
                {
                    countZero++;
                }
                if(countZero>k)
                {
                    break;
                }
                maxLength=Math.max(maxLength,right-left+1);
            }
        }
        System.out.println(maxLength);
    }
    public static void main(String[] args) {
        int [] nums={1,1,1,1,1};
        int k=2;
        maxCount(nums,k);
    }
}
