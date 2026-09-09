package lambda;

interface Check{
    boolean check (String str);
}

interface StringOperation {
    String reverse(String str);
}

public class StringOperations {
    public static void main(String[] args) {
        //Palindrome
      Check palindrome=  str->{
           char[] ch=str.toCharArray();
           int left=0;
           int right=ch.length-1;
           boolean flag=true;
           while (left<right)
           {
               if(ch[left]!=ch[right])
               {
                   flag=false;
                   break;
               }
               left++;
               right--;
           }
           return flag;
        };
        System.out.println(palindrome.check("madam"));

        //reverse
        StringOperation str=str1 ->
        {
            char[] ch=str1.toCharArray();
            int left=0;
            int right= ch.length-1;

            while (left<right)
            {
                char temp=ch[left];
                ch[left]=ch[right];
                ch[right]=temp;

                left++;
                right--;
            }
            return new String(ch);
        };
        System.out.println(str.reverse("Hello"));
    }
}
