public class Palindrome {
    public static void main(String[] args) {
        int num=121;
       int orgnum=num;
       int reverse_num=0;
       while(num>0)
       {
           int digit=num%10;
           reverse_num=reverse_num*10+digit;
           num/=10;
       }
       if(orgnum==reverse_num)
       {
           System.out.println("Number is palindrome");
       }else
       {
           System.out.println("Not Palindrome");
       }
    }
}
