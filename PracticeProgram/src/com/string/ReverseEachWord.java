package com.string;

public class ReverseEachWord {
    static void reverseEachWord(String str)
    {
        String[] words=str.split(" ");
        for(String word:words)
        {
            for(int i=word.length()-1;i>=0;i--)
            {
                System.out.print(word.charAt(i));
            }
            System.out.print(" ");
        }
    }
    public static void main(String[] args) {
        String str="I love java";
        reverseEachWord(str);
    }
}
