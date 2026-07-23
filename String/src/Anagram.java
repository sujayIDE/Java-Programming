import java.util.Arrays;

public class Anagram {
    private static boolean isAnagram(String str1,String str2)
    {
        int size1=str1.length();
        int size2=str2.length();
        if(size1!=size2)
        {
            return false;
        }else {
            str1=str1.toLowerCase();
            str2=str2.toLowerCase();

            char ch1[]= str1.toCharArray();
            char ch2[]=str2.toCharArray();

            Arrays.sort(ch1);
            Arrays.sort(ch2);

            return Arrays.equals(ch1,ch2);
        }
    }
    public static void main(String[] args) {
        String str1="listen";
        String str2="milent";
        boolean flag=Anagram.isAnagram(str1,str2);

        if(flag)
        {
            System.out.println("Anagram");
        }else
        {
            System.out.println("Not Anagram");
        }
    }
}
