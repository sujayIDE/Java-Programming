import java.util.Arrays;

public class Methods_Of_String {
    public static void main(String[] args) {
        //String str="Mahabharat";
        //length()
        //System.out.println(str.length());

        //charAt()
       // System.out.println(str.charAt(0));
        //System.out.println(str.charAt(str.length()-1));

        //indexOf(char)
       // System.out.println(str.indexOf('b'));

        //lastIndexOf()
        //System.out.println(str.lastIndexOf('a'));

        //substring
      //  System.out.println(str.substring(1));
       // System.out.println(str.substring(4,9));

//        String str2="The sky is blue";
//        System.out.println(str2.substring(11,15));

        //  String str="Mahabharat";
//         str=str+" Movie";
//        String str2=str.toUpperCase();
//        System.out.println(str);
//        System.out.println(str2);

//        String str3="the sky is blue";
//        str3=str3.toUpperCase();
//        System.out.println(str3);

//        String str3="the sky is blue";
//        System.out.println(str3.toUpperCase());
//        System.out.println(str3);

        //replace
//        String str="hello hello";
//        String str2=str.replace("hello","world").intern();
//        System.out.println(str2);

//        String str="AshokIT";
//        str=str.replaceAll("[A-Z]","X");
//        System.out.println(str);

//        String str="Micro Services";
//        str=str.replaceAll("\s","");
//        System.out.println(str);

//         join
//        String str[]={"Ajay","Sujay","Vijay"};
//        String s=String.join(":",str);
//        System.out.println(s);

        //split
//        String str="The sky is blue";
//        String str2[]=str.split(" ");
//        for(String s:str2)
//        {
//            System.out.println(s);
//        }

        //equals
//        String str1="AshokIT";
//        String str2="AshokiT";
//        System.out.println(str2==str1);
//        System.out.println(str1.equals(str2));

        //compareTo
//        String str1="Sujay";
//        String str2="Aujay";
//        System.out.println(str1.compareTo(str2));

        String s1="AshokIT";
        char[]ch=s1.toCharArray();
        System.out.println(Arrays.toString(ch));
    }
}
