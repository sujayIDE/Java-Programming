package com.arrayClassProblem.stringnanalyzer;

public class StringOperations {
    public static void main(String[] args) {
        String str="Java Programming";
        System.out.println("Original String: "+str);
        System.out.println();
        System.out.println("Uppercase: "+str.toUpperCase());
        System.out.println();

        int countVowels=0;
        int countCosonent=0;
        for(int i=0;i<str.length();i++)
        {
            char[]ch=str.toCharArray();
            if(ch[i]=='A' || ch[i]=='E' || ch[i]=='I' || ch[i]=='O' || ch[i]=='U' ||
               ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u')
            {
                countVowels++;
            }else{
                countCosonent++;
            }
        }
        System.out.println("Vowels: "+countVowels);
        System.out.println("Consonent: "+countCosonent);

        if(str.startsWith("J"))
        {
            System.out.println("yes");
        }else{
            System.out.println("No");
        }


    }
}
