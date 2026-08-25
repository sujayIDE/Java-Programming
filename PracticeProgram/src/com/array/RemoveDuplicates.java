package com.array;

public class RemoveDuplicates {
    static void removeDuplicate(int [] arr)
    {
        int left=0;
        int right=0;
        while(right<arr.length)
        {
            if(arr[right]!=arr[left])
            {
               left++;
               arr[left]=arr[right];
            }
            right++;
        }
      for(int i=0;i<=left;i++)
      {
          System.out.println(arr[i]);
      }
    }
    public static void main(String[] args) {
        int []arr={1,1,2,2,3,4,4};
        removeDuplicate(arr);
    }
}
