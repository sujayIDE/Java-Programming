import java.util.Scanner;

public class Remove_Duplicate_Character {
    static void remove_duplicate_character(String str)
    {
        boolean flag=false;
        StringBuffer sb=new StringBuffer("");
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(sb.indexOf(String.valueOf(ch))==-1)
            {
                sb=sb.append(ch);
            }
        }
        System.out.println(sb.toString());
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String: ");
        String str=sc.nextLine();
        remove_duplicate_character(str);
    }
}
