package com.slidingwindow;

public class SubArrayProductLessThanKOptimized {
    static void product(int [] nums,int k)
    {
        int left=0;
        int right=0;
        int count=0;
        int product=1;
        while (right<nums.length)
        {
            product*=nums[right];
            if(product<k)
            {
                count++;
            }else {
                break;
            }
        }
    }
    public static void main(String[] args) {
        int [] nums={10,5,2,6};
        int k=100;
        product(nums,k);
    }
}
