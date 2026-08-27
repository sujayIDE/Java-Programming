package com.string;

public class ValidPalindrome2 {
    static boolean isAlphanumeric(char c)
    {
        return (c>='A' && c<='Z'||
                c>='a' && c<='z' ||
                c>='0' && c<='9');
    }
    static boolean validPalindrome(String str)
    {
      char[] ch=str.toCharArray();
      int left=0;
      int right=ch.length-1;
        while (left<right)
        {
            if(!isAlphanumeric(ch[left]))
            {
                left++;
            } else if (!isAlphanumeric(ch[right])) {
                right--;
            }else{
                if(Character.toLowerCase(ch[left])!=Character.toLowerCase(ch[right]))
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
        String str="A man, a plan, a canal : panama";
        System.out.println( validPalindrome(str));
    }
}
