package com.twopointer;

import java.util.Arrays;

public class SortColorsOptimized {
    static void sortColors(int []nums){
        int low=0;
        int mid=0;
        int high=nums.length-1;

        while (mid<=high){
            if(nums[mid]==0)
            {
                nums[mid]=nums[low];
                nums[low]=0;
                low++;
                mid++;
            } else if (nums[mid]==1) {
                mid++;
            }else {
                nums[mid]=nums[high];
                nums[high]=2;
                high--;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
    public static void main(String[] args) {
        int []nums={1,1,0,2,0,1,2,0,2};
        sortColors(nums);
    }
}
