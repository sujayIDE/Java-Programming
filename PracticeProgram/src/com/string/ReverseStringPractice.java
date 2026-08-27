package com.string;

import java.util.Arrays;

public class ReverseStringPractice {
    static void reverseString(String str)
    {
        char [] ch=str.toCharArray();
        int left=0;
        int right=ch.length-1;
        while (left<right)
        {
            char temp=ch[left];
            ch[left]=ch[right];
            ch[right]=temp;
            left++;
            right--;
        }
        System.out.println(Arrays.toString(ch));;
    }
    public static void main(String[] args) {
        String str="Hello";
        reverseString(str);
    }
}
