package string;

public class ReverseVowels {
    static boolean isVowels(char ch)
    {
        return "AEIOUaeiou".indexOf(ch)!=-1;
    }

    static void reverseVowels(String str)
    {
        int left=0;
        int right=str.length()-1;
        char[] ch=str.toCharArray();
        while (left<right)
        {
            if(!isVowels(ch[left])){
                left++;
            } else if (!isVowels(ch[right])) {
                right--;
            }else {
                char temp=ch[left];
                ch[left]=ch[right];
                ch[right]=temp;
                left++;
                right--;
            }
        }
        System.out.println(ch);

    }
    public static void main(String[] args) {
        String str="hello";
        reverseVowels(str);
    }
}
