import java.util.Scanner;

public class CharacterLowerToUpperAndUpperToLowerWithNext5Characters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Character");
        char ch = sc.next().charAt(0);

        if (ch >= 'A' && ch <= 'Z') {
            ch = (char) (ch + 32);
            for (int i = 0; i < 5; i++) {
                System.out.print(ch + " ");
                ch++;

                if (ch > 'z') {
                    ch = 'a';
                }
            }
        } else if (ch >= 'a' && ch <= 'z') {
            ch = (char) (ch - 32);

            for (int i = 0; i < 5; i++) {
                System.out.print(ch + " ");
                ch++;

                if (ch > 'Z') {
                    ch = 'A';
                }
            }
        }
        else
            System.out.println("Enter Alphabet");

    }}

