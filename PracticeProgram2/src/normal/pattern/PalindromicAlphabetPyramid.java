package normal.pattern;

public class PalindromicAlphabetPyramid {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            char ch = 'A';
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(ch + " ");
                ch++;
            }
            for (int k = i - 1; k >= 1; k--) {
                ch--;
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}
