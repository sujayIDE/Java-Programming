package com.twopointer.string;

public class PalindromicCountOfSubstring {
    static boolean isPalindrome(String s,int left,int right)
    {
        while (left<right){
            if(s.charAt(left)!=s.charAt(right))
            {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
        String s="babad";
        String result="";
        int palindromeCount=0;
        for(int i=0;i<s.length();i++)
        {
            for(int j=i;j<s.length();j++)
            {
                if(isPalindrome(s,i,j))
                {
                   palindromeCount++;
                }
            }
        }
        System.out.println("Palindrome Count is : "+palindromeCount);
    }
}
