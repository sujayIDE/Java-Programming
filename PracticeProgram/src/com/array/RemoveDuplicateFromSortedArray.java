package com.array;

public class RemoveDuplicateFromSortedArray {
    static int removeDuplicate(int []arr)
    {
        int left=0;
        int right=1;

        while(right<arr.length){
            if(arr[right]!=arr[left])
            {
                left++;
                arr[left]=arr[right];
            }
            right++;
        }
        return left+1;
    }
    public static void main(String[] args) {
        int[]arr={1, 1, 2, 2, 3, 3, 4};
       int count= removeDuplicate(arr);
        System.out.println(count);

        for(int i=0;i<count;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
