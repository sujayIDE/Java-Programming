package com.string;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        String str="abbcdda";
        char []ch=str.toCharArray();
        int count=0;
            for(int i=0;i<str.length();i++)
            {
                count=0;
                for(int j=0;j<ch.length;j++)
                {
                    if(ch[j]==ch[i])
                    {
                        count++;
                    }
                }
                if(count==1)
                {
                    System.out.println(ch[i]);
                }
            }
    }
}
