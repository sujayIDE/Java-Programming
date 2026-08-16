package lambda.thread;

public class ThreadMain {
    public static void main(String[] args) {
        Runnable runnable=()->
                System.out.println("Thread is running");

        Thread thread1=new Thread(runnable);
        thread1.start();
    }
}
