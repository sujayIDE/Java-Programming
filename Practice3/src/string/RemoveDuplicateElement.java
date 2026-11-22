package string;

public class RemoveDuplicateElement {
    static void removeDuplicate(String str)
    {
        boolean[] visited=new boolean[str.length()];
        for(int i=0;i<str.length();i++)
        {
         if(visited[i])
         {
             continue;
         }
            System.out.println(str.charAt(i));
         for(int j=0;j<str.length();j++)
         {
             if(str.charAt(i)==str.charAt(j))
             {
                 visited[j]=true;
             }
         }
        }
    }
    public static void main(String[] args) {
        String str = "programming";
        removeDuplicate(str);
    }
}
