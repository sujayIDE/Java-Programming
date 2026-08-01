import java.util.Scanner;

public class PrimeNumberSumExpress {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        for (int i = 2; i <= num / 2; i++) {

            boolean prime1 = true;
            boolean prime2 = true;

            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    prime1 = false;
                    break;
                }
            }

            int k = num - i;

            for (int j = 2; j <= Math.sqrt(k); j++) {
                if (k % j == 0) {
                    prime2 = false;
                    break;
                }
            }

            if (prime1 && prime2) {
                System.out.println(i + " + " + k + " = " + num);
            }
        }
    }
}