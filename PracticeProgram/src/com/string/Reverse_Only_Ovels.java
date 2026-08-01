package com.string;

public class Reverse_Only_Ovels {
    static boolean isOwel(char ch)
    {
        return "AEIOUaeiou".indexOf(ch)!=-1;
    }
    static void reverse(String str)
    {
        int left=0;
        int right=str.length()-1;
        char[] ch=str.toCharArray();

        while (left<right)
        {
            if(!isOwel(ch[left]))
            {
                left++;
            } else if (!isOwel(ch[right])) {
                right--;
            }else {
                char temp=ch[left];
                ch[left]=ch[right];
                ch[right]=temp;

                left++;
                right--;
            }

        }
        System.out.println(new String(ch));
    }
    public static void main(String[] args) {
        String str="hello";
        reverse(str);
    }
}
