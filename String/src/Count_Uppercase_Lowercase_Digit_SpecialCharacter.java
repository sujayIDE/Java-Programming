public class Count_Uppercase_Lowercase_Digit_SpecialCharacter {
    static void count(String str)
    {
        int u=0,l=0,d=0,sp=0;

        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(ch>='A' && ch<='Z')
            {
                u++;
            } else if (ch>='a' && ch<='z') {
                l++;
            } else if (ch>='0' && ch<='9') {
                d++;
            }else {
                sp++;
            }
        }

        System.out.println("UpperCount: "+u);
        System.out.println("LowerCount: "+l);
        System.out.println("Digit: "+d);
        System.out.println("SpecialCharacterCount: "+sp);
    }
    public static void main(String[] args) {
        String str="Java123@Boot";
        count(str);
    }
}
