package practice.synchronization;

public class Main {
    public static void main(String[] args) {
        AccountBalance accountBalance=new AccountBalance();

        Thread1 thread1=new Thread1(accountBalance);
        Thread2 thread2=new Thread2(accountBalance);

        thread1.start();
        thread2.start();
    }
}
