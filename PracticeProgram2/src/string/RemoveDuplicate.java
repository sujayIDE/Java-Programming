package string;

public class RemoveDuplicate {
    static void removeDuplicate(String str)
    {
        char[] ch=str.toCharArray();
       String result="";
       for(int i=0;i<ch.length;i++)
       {
           if(result.indexOf(ch[i])==-1)
           {
               result=result+ch[i];
           }
       }
        System.out.println(result);
    }
    public static void main(String[] args) {
        String str="programming";
        removeDuplicate(str);
    }
}
