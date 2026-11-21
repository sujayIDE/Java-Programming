package number;

public class StringIntern {
    public static void main(String[] args) {
        String str1="Sujay";
        String str2 = str1.intern();

        System.out.println(str1==str2);
    }
}
