package string;

import java.util.Scanner;

public class CountVowelsConsonents {
    public static boolean isVowel(char ch)
    {
        return "AEIOUaeiou".indexOf(ch)!=-1;
    }
    static void countVowels(String str){
        char[] ch=str.toCharArray();
        int countVowels=0;
        int countConsonents=0;

        for(int i = 0; i < ch.length; i++)
        {
            if((ch[i] >= 'A' && ch[i] <= 'Z') ||
                    (ch[i] >= 'a' && ch[i] <= 'z'))
            {
                if(isVowel(ch[i]))
                {
                    countVowels++;
                }
                else
                {
                    countConsonents++;
                }
            }
        }
        System.out.println("CountVowels : "+countVowels);
        System.out.println("CountConsonents : "+countConsonents );
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String : ");
        String str=sc.nextLine();

        countVowels(str);
    }
}
