public class Anagrams {
    static void checkAnagram(String str1,String str2){
        str1 = str1.replace(" ", "").toLowerCase();
        str2 = str2.replace(" ", "").toLowerCase();

        if(str1.length()!=str2.length())
        {
            System.out.println("Not anagram.");
            return;
        }

        for(int i=0;i<str1.length();i++)
        {
            boolean found=false;
            char[]ch=str2.toCharArray();
            for(int j=0;j<str2.length();j++)
            {
                if(str1.charAt(i)==str2.charAt(j))
                {
                    found=true;
                }
            }
            if(found)
            {
                System.out.println("anagram...");
                break;
            }else {
                System.out.println("not Anagram");
                break;
            }
        }
    }
    public static void main(String[] args) {
        String str1="Dormitory";
        String str2="Dirty Room";
        checkAnagram(str1,str2);
    }
}
