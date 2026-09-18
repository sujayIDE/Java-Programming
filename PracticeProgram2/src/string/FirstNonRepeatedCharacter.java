package string;

public class FirstNonRepeatedCharacter {
    static void firstNonRepeatCharacter(String str)
    {
        char[] ch=str.toCharArray();
        for(int i=0;i<ch.length;i++)
        {
            int count=0;
            for(int j=0;j<ch.length;j++)
            {
                if(ch[i]==ch[j])
                {
                    count++;
                }
            }
            if(count==1)
            {
                System.out.println("First non repeating character is : "+ch[i]);
                break;
            }
        }
    }
    public static void main(String[] args) {
        String str="swiss";
        firstNonRepeatCharacter(str);
    }
}
