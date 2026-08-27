package com.string;

public class FrequencyOfCharater2 {
    static void frequency(String str)
    {
        char [] ch=str.toCharArray();
        for(int i=0;i<str.length();i++)
        {
            int count=0;
            boolean flag=false;
            for(int j=0;j<i;j++)
            {
                if(ch[i]==ch[j]){
                    flag=true;
                    break;
                }
            }
            if(flag)
            {
                continue;
            }

            for(int k=0;k<ch.length;k++)
            {
                if(ch[k]==ch[i])
                {
                    count++;
                }
            }
            System.out.println(ch[i]+"->"+count);
        }
    }
    public static void main(String[] args) {
        String str="abcaabcd";
        frequency(str);
    }
}
