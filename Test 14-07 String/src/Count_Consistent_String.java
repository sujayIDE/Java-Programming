import java.util.Arrays;

public class Count_Consistent_String {
    public static int countConsistentStrings(String allowed, String[] words){
        int count=0;
        for(String s:words)
        {
            System.out.println(s);
        }
            for(int j=0;j<words.length;j++)
            {
                if(words[j].contains(allowed))
                {
                    count++;
                }
            }

            return count;
    }
    public static void main(String[] args) {
        String allowed = "ab";
       String [] words = {"ad","bd","aaab","baa","badab","abcd"};
        System.out.println("Count: "+countConsistentStrings(allowed,words));
    }
}
