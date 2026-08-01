public class Non_Repeating_Character {
    static void checkNonRepeatingCharacter(String str)
    {
        char[] ch=str.toCharArray();
        for(int i=0;i<str.length();i++)
        {
            if(str.indexOf(ch[i])==str.lastIndexOf(ch[i]))
            {
                System.out.println("First Non-Repeating Character: "+ch[i]);
                break;
            }
        }
    }
    public static void main(String[] args) {
        String str="leetcode";
        checkNonRepeatingCharacter(str);
    }
}
