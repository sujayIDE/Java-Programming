package com.string;

public class ValidPalindrome {
    static boolean isPalindrome(String str,int left,int right)
    {
        boolean flag=true;
        while (left<right)
        {
            if(str.charAt(left)!=str.charAt(right))
            {
                flag=false;
                break;
            }
            left++;
            right--;
        }
        return flag;
    }
    static boolean validPalindrome(String str)
    {
        char [] ch=str.toCharArray();
        int left=0;
        int right=ch.length-1;
        while (left<right)
        {
            if(ch[left]!=ch[right])
            {
                return isPalindrome(str,left+1,right)||
                        isPalindrome(str,left,right-1);
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
        String str="abca";
        System.out.println(validPalindrome(str));
    }
}
