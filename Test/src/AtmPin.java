import java.util.Scanner;

public class AtmPin {
    public static void main(String[] args) {
        int pin=1234;
        int maxAttempt=3;
        int attempt=1;
        boolean flag=false;
            while(attempt<=maxAttempt)
            {
                System.out.println("Enter Pin:");
                Scanner sc=new Scanner(System.in);
                int enterPin=sc.nextInt();
                if(pin==enterPin)
                {
                    System.out.println("Access Granted");
                    flag=true;
                    break;
                }
                else {
                    System.out.println("pin is incorrect");
                }
                attempt++;
            }
            if(!flag)
            {
                System.out.println("Card blocked");
            }

    }
}
