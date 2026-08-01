package com.array;

public class ArrayPalindrome {
    static void checkArrayPalindrome(int []arr)
    {
        int left=0;
        int right=arr.length-1;
        boolean flag=true;
        while (left<right)
        {
            if(arr[left]!=arr[right])
            {
                flag=false;
                break;
            }
            left++;
            right--;
        }
        if(flag)
        {
            System.out.println("Array is palindrome...");
        }else {
            System.out.println("Not palindrome...");
        }
    }
    public static void main(String[] args) {
        int [] arr={1, 2, 3, 2, 1};
        checkArrayPalindrome(arr);
    }
}
