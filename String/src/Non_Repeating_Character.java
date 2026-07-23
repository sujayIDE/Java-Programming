import java.util.Scanner;

public class Non_Repeating_Character {
    static void non_repeating(String str)
    {
        boolean flag=false;
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(str.indexOf(ch)==str.lastIndexOf(ch))
            {
                System.out.println("Non repeating character: "+ch);
                flag=true;
                break;
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string: ");
        String str=sc.nextLine();
        non_repeating(str);
    }
}
