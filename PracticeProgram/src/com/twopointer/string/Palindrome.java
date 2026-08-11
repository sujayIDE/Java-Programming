package com.twopointer.string;

public class Palindrome {
    private static boolean isAlphaNum(Character c)
    {
        return c>='a' && c<='z' ||
                c>='A' && c<='Z' ||
                c>='0' && c<='9';
    }
    static boolean isPalindrome(String s)
    {
        int left=0;
        int right=s.length()-1;

        while(left<right)
        {
            char l=s.charAt(left);
            char r=s.charAt(right);

            if(!isAlphaNum(l))
            {
                left++;
            } else if (!isAlphaNum(r)) {
                right--;
            }else {
                if(Character.toLowerCase(l)!=Character.toLowerCase(r))
                {
                    return false;
                }
                left++;
                right--;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s="A man, a plan, a canal : panama";
        boolean result=isPalindrome(s);
        if(result)
        {
            System.out.println("Palindrome....");
        }else{
            System.out.println("Not palindrome...........");
        }
    }
}
