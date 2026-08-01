import java.util.Scanner;

public class ElseIfLadder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int n = sc.nextInt();

        if (n % 3 == 0 && n % 5 == 0) {
            System.out.println("war");
        } else if (n % 3 == 0) {
            System.out.println("zip");
        } else if (n % 5 == 0) {
            System.out.println("zap");
        } else {
            System.out.println("jar");
        }
    }
}