package com.slidingwindow;

public class ConsecutiveOneOptimized {
    static void countOne(int [] nums,int k)
    {
        int left=0;
        int right=0;
        int countZero=0;
        int maxLength=0;
        while(right<nums.length)
        {
            if(nums[right]==0)
            {
                countZero++;
            }
            while (countZero>k)
            {
                if(nums[left]==0 )
                {
                    countZero--;
                }
                left++;
            }
            maxLength=Math.max(maxLength,right-left+1);
            right++;
        }
        System.out.println(maxLength);
    }
    public static void main(String[] args) {
        int [] nums={1,1,1,0,0,0,1,1,1,1,0};
        int k=2;
        countOne(nums,k);
    }
}
