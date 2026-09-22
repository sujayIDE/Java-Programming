package string;

public class Anagram {
    static void checkAnagram(String str1,String str2)
    {
        if(str1.length()!=str2.length())
        {
            return;
        }

        char[] ch1=str1.toCharArray();
        char[] ch2=str2.toCharArray();
        boolean [] visited1=new boolean[ch1.length];
        boolean[] visited2=new boolean[ch2.length];
        for(int i=0;i<ch1.length;i++)
        {
            if(visited1[i])
            {
                continue;
            }
            int count1=0;
            int count2=0;
            for(int j=0;j<ch1.length;j++)
            {
                if(ch1[i]==ch1[j])
                {
                    count1++;
                    visited1[j]=true;
                }
            }

            for (int j = 0; j < ch2.length; j++) {
                if (ch1[i] == ch2[j]) {
                    count2++;
                }
            }

            if(count1!=count2)
            {
                System.out.println("Not anagram");
                return;
            }
        }
        System.out.println("Anagram");
    }
    public static void main(String[] args) {
        String str1="Silent";
        String str2="Listen";
        checkAnagram(str1.toLowerCase(),str2.toLowerCase());
    }
}
