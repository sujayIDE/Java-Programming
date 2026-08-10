package com.twopointer;

import java.util.Arrays;

public class SortcolorBruteForce {
    static void sortColors(int []nums)
    {
        int countZero=0;
        int countOne=0;
        int countTwo=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            {
                countZero++;
            } else if (nums[i]==1) {
                countOne++;
            }else {
                countTwo++;
            }
        }

        int i=0;
        while (countZero>0)
        {
            nums[i]=0;
            i++;
            countZero--;
        }


        while(countOne>0)
        {
            nums[i]=1;
            i++;
            countOne--;
        }

        while (countTwo>0)
        {
            nums[i]=2;
            i++;
            countTwo--;
        }

        System.out.println(Arrays.toString(nums));
    }
    public static void main(String[] args) {
        int nums[]={1,1,0,2,0,1,2,0,2};
        sortColors(nums);
    }
}
