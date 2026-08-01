public class ShuffleString {
    public static String restoreString(String s, int[] indices){
        char[] temp=new char[s.length()];
        for(int i=0;i<s.length();i++)
        {
            temp[indices[i]]=s.charAt(i);
        }
        return new String(temp);
    }
    public static void main(String[] args) {
        String s="code";
        int[] indices={3,1,2,0};
        System.out.println(restoreString(s,indices));
    }
}
