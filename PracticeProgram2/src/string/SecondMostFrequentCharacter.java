package string;

public class SecondMostFrequentCharacter {
    static void secondFrequentCharacter(String str)
    {
        char[] ch=str.toCharArray();
        boolean[] visited=new boolean[ch.length];
        int maxCount=0;
        int secondMaxCount=0;
        char maxChar='\0';
        char secondMaxChar='\0';
        for(int i=0;i<ch.length;i++)
        {
            if(visited[i])
            {
                continue;
            }
            int count=0;
            for(int j=0;j<ch.length;j++)
            {
                if(ch[i]==ch[j])
                {
                    count++;
                    visited[j]=true;
                }
            }

            if(count>maxCount)
            {
                secondMaxCount=maxCount;
                secondMaxChar=maxChar;

                maxCount=count;
                maxChar=ch[i];
            } else if (count>secondMaxCount && count<maxCount) {
                secondMaxCount = count;
                secondMaxChar = ch[i];
            }
        }
        System.out.println("Second max char : "+secondMaxChar);
    }
    public static void main(String[] args) {
        String str="banana";
        secondFrequentCharacter(str);
    }
}
