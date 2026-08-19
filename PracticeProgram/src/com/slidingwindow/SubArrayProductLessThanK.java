package com.slidingwindow;

import java.util.ArrayList;
import java.util.Arrays;

public class SubArrayProductLessThanK {
    static void product(int[] nums, int k)
    {
        int count=0;
      for(int i=0;i<nums.length;i++)
      {
          int product=1;
          for(int j=i;j>=0;j--)
          {
              product*=nums[j];
              if(product<k)
              {
                  count++;
              }else {
                  break;
              }
          }
      }
        System.out.println(count);
    }
    public static void main(String[] args) {
        int [] nums={10,5,2,6};
        int k=100;
        product(nums,k);
    }
}
