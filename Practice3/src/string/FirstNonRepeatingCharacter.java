package string;

public class FirstNonRepeatingCharacter {
    static void nonRepeatingCharacter(String str)
    {
        boolean[] visited=new boolean[str.length()];
        for(int i=0;i<str.length();i++)
        {
            if(visited[i])
            {
                continue;
            }
            int count=0;
            for(int j=0;j<str.length();j++)
            {
               if(str.charAt(i)==str.charAt(j))
               {
                   count++;
                   visited[j]=true;
               }
            }
            if(count<2)
            {
                System.out.println(str.charAt(i));
                break;
            }
        }
    }
    public static void main(String[] args) {
        String str="swiss";
        nonRepeatingCharacter(str);
    }
}
