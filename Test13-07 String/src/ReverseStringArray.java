public class ReverseStringArray {
    static void reverseStringArray(String str[])
    {
        int start=0;
        int end=str.length-1;

        while(start<end)
        {
            String temp=str[start];
            str[start]=str[end];
            str[end]=temp;

            start++;
            end--;
        }

        for(String s:str)
        {
            System.out.print(s+" ");
        }
    }
    public static void main(String[] args) {
        String[] str={"h","e","l","l","o"};
        reverseStringArray(str);
    }
}
