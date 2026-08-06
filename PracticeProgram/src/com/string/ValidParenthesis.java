package com.string;

public class ValidParenthesis {
    public static void main(String[] args) {
        String str = "(()(())";
        int count=0;

        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='(')
            {
                count++;
            }else {
                count --;

                if(count<0)
                {
                    System.out.println("Invalid...");
                    return;
                }
            }
        }
        if(count==0)
        {
            System.out.println("Valid");
        }else {
            System.out.println("Invalid");
        }
    }
}
