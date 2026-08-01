public class Longest_SubString {
    public static int lengthOfLongestSubstring(String s){
        int maxlength = 0;
        for(int i=0;i<s.length();i++)
        {
            String str1="";
            for(int j=i;j<s.length();j++) {

                str1 = str1 + s.charAt(j);
                System.out.println(str1);
                if (str1.length() > maxlength) {
                    maxlength = str1.length();
                }
            }
        }
        return maxlength;
    }
    public static void main(String[] args) {
        String str="abcdabcbb";
        System.out.println("Length: "+lengthOfLongestSubstring(str));
    }
}
