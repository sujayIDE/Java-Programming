public class Palindrome {
    static void validPalindrome(String str)
    {
        str=str.toLowerCase();
        System.out.println(str);

        str=str.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(str);

        boolean flag=true;
        for(int i=0,j=str.length()-1;i<(str.length())/2;i++,j--)
        {
            if(str.charAt(i)!=str.charAt(j))
            {
                flag=false;
                break;
            }
        }

        if(flag==true)
        {
            System.out.println("Palindrome");
        }else
        {
            System.out.println("Not Palindrome");
        }



    }
    public static void main(String[] args) {
        String str="A man, a plan, a canal: Panama";
        validPalindrome(str);
    }
}
