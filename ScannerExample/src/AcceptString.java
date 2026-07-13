import java.util.Scanner;

public class AcceptString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your name:");
        String name=sc.nextLine();
        System.out.print("Enter your mobile number:");
        long number=sc.nextLong();

        System.out.println();
        System.out.println("Name:"+name+" "+
                            "Phno:"+number);
    }
}
