package com.twopointer.string;

public class ValidPalindrome2 {

    static boolean validPalindrome(String s)
    {
        int left=0;
        int right=s.length()-1;
        while (left<right)
        {
            if(s.charAt(left)!=s.charAt(right))
            {
                return isPalindrome(s,left+1,right) || isPalindrome(s,left,right-1);
            }
            left++;
            right--;
        }
        return true;
    }

    static boolean isPalindrome(String s,int left,int right)
    {
        boolean flag=true;
        while (left<right)
        {
            if(s.charAt(left)!=s.charAt(right))
            {
                flag=false;
                break;
            }
            left++;
            right--;
        }
        return flag;
    }
    public static void main(String[] args) {
        String s="abca";
        boolean result=validPalindrome(s);
        System.out.println(result);

        if(result)
        {
            System.out.println("Palindrome..");
        }else{
            System.out.println("Not palindrome");
        }
    }
}
