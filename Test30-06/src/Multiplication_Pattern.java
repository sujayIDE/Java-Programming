import java.util.Scanner;

public class Multiplication_Pattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter row: ");
        int row=sc.nextInt();
        System.out.println("Enter column: ");
        int col=sc.nextInt();

        for(int i=1;i<=row;i++){
            for(int j=1;j<=col;j++)
            {
                System.out.print(i*j+" ");
            }
            System.out.println();
        }
    }
}
