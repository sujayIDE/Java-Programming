package com.string;

public class CheckPalindrome {
    static void checkPalindrome(String str)
    {
        char [] ch=str.toCharArray();
        int left=0;
        int right=ch.length-1;
        boolean flag=true;
        while (left<right)
        {
            if(ch[left]!=ch[right])
            {
                flag=false;
                break;
            }
            left++;
            right--;
        }
        if(flag)
        {
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
    }
    public static void main(String[] args) {
        String str="madam";
        checkPalindrome(str);
    }
}
