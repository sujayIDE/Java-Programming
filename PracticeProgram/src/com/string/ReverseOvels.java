package com.string;

import java.util.Arrays;

public class ReverseOvels {
    static boolean isOwel(char ch)
    {
        return "AEIOUaeiou".indexOf(ch)!=-1;
    }
    static void reverseOwels(String str)
    {
        char[] ch=str.toCharArray();
        int left=0;
        int right=ch.length-1;
        while (left<right)
        {
            if(!isOwel(ch[left]))
            {
                left++;
            } else if (!isOwel(ch[right])) {
                right--;
            }else {
                char temp=ch[left];
                ch[left]=ch[right];
                ch[right]=temp;
                left++;
                right--;
            }
        }
        System.out.println(Arrays.toString(ch));
        System.out.println(new String(ch));
    }
    public static void main(String[] args) {
        String str="hello my students";
        reverseOwels(str);
    }
}
