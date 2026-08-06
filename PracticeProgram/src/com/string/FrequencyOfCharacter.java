package com.string;

public class FrequencyOfCharacter {
    public static void main(String[] args) {
        String str="abcaabcd";
        char[] ch=str.toCharArray();
        int count=0;
        for(int i=0;i<str.length();i++)
        {
            count=0;
            boolean flag=false;
            for(int j=0;j<i;j++) {
                if (ch[j] == ch[i]) {
                    flag = true;
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
            System.out.println(ch[i]+" "+count);

            }

        }
    }

