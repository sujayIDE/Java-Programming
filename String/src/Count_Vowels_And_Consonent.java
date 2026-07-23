public class Count_Vowels_And_Consonent {
    private static void countVowelsAndConsonent(String str)
    {
        if(str==null || str.trim().length()==0)
        {
            System.out.println("The given string is null or empty...");
            return;
        }
        str=str.toLowerCase();

        int size=str.length();

        int v=0,c=0;
        for(int i=0;i<size;i++)
        {
            char ch=str.charAt(i);
            if(ch>='a' && ch<='z')
            {
                if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
                {
                  v++;
                }else {
                    c++;
                }
            }
        }
        System.out.println("String is: "+str);
        System.out.println("Vowels: "+v);
        System.out.println("Consonent: "+c);
    }

    public static void main(String[] args) {
        String str="Mahabharat";
        Count_Vowels_And_Consonent.countVowelsAndConsonent(str);
    }
}
