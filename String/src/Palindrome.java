public class Palindrome {
    private static boolean isPalindrome(String str)
    {
        int size = str.length();
        str=str.toLowerCase();
        for (int i = 0, j = size - 1; i < size / 2; i++, j--) {
            if(str.charAt(i)!=str.charAt(j))
            {
                    return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str="maam";
        Palindrome p=new Palindrome();
        boolean flag=p.isPalindrome(str);
        if(flag)
        {
            System.out.println("Palindrome");
        }else {
            System.out.println("Not Palindrome");
        }
    }
}
