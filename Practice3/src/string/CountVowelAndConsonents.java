package string;

public class CountVowelAndConsonents {
    static boolean isVowel(char ch)
    {
        return "AEIOUaeiou".indexOf(ch)!=-1;
    }
    static void count(String str)
    {
        int vowelCount=0;
        int consonentCount=0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)==' ')
            {
                continue;
            }
            if(isVowel(str.charAt(i)))
            {
                vowelCount++;
            }else {
                consonentCount++;
            }
        }
        System.out.println("Vowel count : "+vowelCount);
        System.out.println("Consonent count : "+consonentCount);
    }
    public static void main(String[] args) {
        String str="Java Programming";
        count(str);
    }
}
