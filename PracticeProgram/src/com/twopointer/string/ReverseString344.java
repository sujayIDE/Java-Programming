package com.twopointer.string;

import java.util.Arrays;

public class ReverseString344 {
    static void reverseString(char[]ch){
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
        System.out.println(Arrays.toString(ch));
    }
    public static void main(String[] args) {
        char[] s = {'h', 'e', 'l', 'l', 'o'};
        reverseString(s);
    }
}
