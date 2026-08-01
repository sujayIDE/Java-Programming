package com.string;

public class Palindrome {
    static void isPalindrome(String str)
    {
        char[] ch=str.toCharArray();
        int left=0;
        int right=str.length()-1;
        boolean flag=true;
        while(left<right)
        {
            if(ch[left]!=ch[right])
            {
                flag=false;
                break;
            }
            left++;
            right--;
        }
        if(flag==true)
        {
            System.out.println("Palindrome");
        }else {
            System.out.println("Not palindrome");
        }
    }
    public static void main(String[] args) {
        String str="madam";
        isPalindrome(str);
    }
}
