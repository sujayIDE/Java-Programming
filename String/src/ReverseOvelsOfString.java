public class ReverseOvelsOfString {

    static boolean isVowel(char ch)
    {
        return "AEIOUaeiou".indexOf(ch)!=-1;
    }
    static void reverse(String str)
    {
        char [] ch=str.toCharArray();

        int left=0;
        int right=str.length()-1;
        while (left<right)
        {
            while(left<right && !isVowel(ch[left])){
                left++;
            }

            while (left<right && !isVowel(ch[right]))
            {
                right--;
            }

            char temp=ch[left];
            ch[left]=ch[right];
            ch[right]=temp;

            left++;
            right--;
        }
        System.out.println(ch);
    }
    public static void main(String[] args) {
        String str="IceCreAm";
        reverse(str);
    }
}
