package string;

public class DuplicateElement {
    static void duplicate(String str)
    {

        char[] ch=str.toCharArray();
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
                if(ch[i]==ch[j])
                {
                    count++;
                    visited[j]=true;
                }
            }
            if(count>1)
            {
                System.out.println(ch[i]);
            }
        }
    }
    public static void main(String[] args) {
        String str = "programming";
        duplicate(str);
    }
}
