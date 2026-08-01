package com.string;

public class Check_Palinndrome {
    static void palindrome(String str)
    {
        int left=0;
        int right=str.length()-1;
        char[] ch=str.toCharArray();
        boolean flag=true;
        while(left<right){
            if(ch[left]!=ch[right]){
                flag=false;
                break;
            }
            left++;
            right--;
        }
        if(flag){
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not palindrome");
        }
    }
    public static void main(String[] args) {
        String str="madam";
        palindrome(str);
    }
}
