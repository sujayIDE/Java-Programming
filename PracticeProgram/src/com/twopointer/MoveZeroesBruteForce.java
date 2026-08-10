package com.twopointer;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MoveZeroesBruteForce {
    static void moveZeroes(int []nums)
    {

        int i=0;
        for(int j=0;j< nums.length;j++)
        {
            if(nums[j]!=0)
            {
                int temp=nums[j];
                nums[j]=nums[i];
                nums[i]=temp;
                i++;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
    public static void main(String[] args) {
        int []arr={0,1,0,3,12};
        moveZeroes(arr);
    }
}
