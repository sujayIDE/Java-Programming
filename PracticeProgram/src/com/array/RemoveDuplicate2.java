package com.array;

public class RemoveDuplicate2 {
    static int remove(int []arr)
    {
        int left=0;
        int right=0;
        int count=0;
        while(right<arr.length)
        {
            if(arr[left]==arr[right])
            {
                right++;
            }else{
                left++;

                arr[left]=arr[right];
            }
        }
        return left+1;
    }
    public static void main(String[] args) {
        int [] arr={1,1,2};
       int count= remove(arr);
        System.out.println(count);
       for(int i=0;i<count;i++)
       {
           System.out.print(arr[i]+" ");
       }
    }
}
