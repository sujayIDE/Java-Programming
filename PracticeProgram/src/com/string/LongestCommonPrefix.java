package com.string;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] str={"interview", "internet", "internal"};

        String prefix=str[0];
        for(int i=0;i<str.length;i++)
        {
            while (!str[i].startsWith(prefix))
            {
                prefix=prefix.substring(0,prefix.length()-1);

                if(prefix.isEmpty())
                {
                    System.out.println("Prefix is not present...");
                }
            }
        }
        System.out.println(prefix);
    }
}
