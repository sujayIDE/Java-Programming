public class Reverse_Words_In_String {

    static void reverseString(String str) {

        int k = 0;

        for (int i = 0; i <= str.length(); i++) {

            if (i == str.length() || str.charAt(i) == ' ') {

                int l = i;

                for (int m = l - 1; m >= k; m--) {
                    System.out.print(str.charAt(m));
                }

                if (i != str.length()) {
                    System.out.print(" ");
                }

                k = i + 1;
            }
        }
    }

    public static void main(String[] args) {

        String str = "Let's take LeetCode contest";
        reverseString(str);

    }
}