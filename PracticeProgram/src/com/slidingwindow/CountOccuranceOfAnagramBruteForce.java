package patterns.slidingwindow;

public class CountOccuranceOfAnagramBruteForce {
    static void countOccuranceOfAnagram(String str,String ptr)
    {
        for(int i=0;i<str.length()-ptr.length();i++)
        {
            String subString=str.substring(i,i+ptr.length());
            System.out.println(subString);
        }
    }
    public static void main(String[] args) {
        String str="aabaabaa";
        String ptr="aaba";
        countOccuranceOfAnagram(str,ptr);
    }
}
