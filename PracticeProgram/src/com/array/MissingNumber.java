package com.array;

public class MissingNumber {
    static void missingNumber(int[]arr)
    {
        int i=1;
        int j=0;
        while(i<arr.length && j<arr.length)
        {
            if(i!=arr[j])
            {
                System.out.println(i);
               break;
            }
            i++;
            j++;
        }
    }
    public static void main(String[] args) {
        int [] arr={1,2,4,5};
        missingNumber(arr);
    }
}
