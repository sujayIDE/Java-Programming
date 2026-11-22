package string;

public class ReverseString {
    static void reverse(String str)
    {
        int left =0;
        int right=str.length()-1;
        char[] ch = str.toCharArray();
        while (left<right)
        {
            char temp=ch[left];
            ch[left]=ch[right];
            ch[right]=temp;
            left++;
            right--;
        }
        System.out.println(ch);
    }
    public static void main(String[] args) {
        String str="Java";
        reverse(str);
    }
}
