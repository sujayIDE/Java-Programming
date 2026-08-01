import java.util.Arrays;

public class Length_Of_Last_Word {
    static void countLengthOfLastWord(String str)
    {
        str=str.trim();
        String [] lastWord=str.split("\\s+");
        System.out.print(Arrays.toString(lastWord));
        System.out.println();
        String str1=lastWord[lastWord.length-1];
        System.out.println(str1);
        System.out.println("Length of Last Word is: "+str1.length());

    }
    public static void main(String[] args) {
        String str="Hello World";
        String str2="   fly me   to   the moon   ";
        countLengthOfLastWord(str);
        System.out.println();
        countLengthOfLastWord(str2);
    }
}
