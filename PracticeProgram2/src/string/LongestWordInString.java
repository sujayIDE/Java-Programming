package string;

public class LongestWordInString {
    static void longestWord(String str)
    {
        String[] words=str.split(" ");
        String longest="";
        int maxCount=0;
        for(String word : words)
        {
            int count=0;
            for(int i=0;i<word.length();i++)
            {
                count++;
            }

            if(count>maxCount)
            {
                maxCount=count;
                longest=word;
            }
        }
        System.out.println("Longest String : "+longest);
    }
    public static void main(String[] args) {
        String str="I Love Java Programming";
        longestWord(str);
    }
}
