package in.ashokit.counter;

public class MainClass {
    public static void main(String[] args) {
        Counter counter=new Counter();
        Thread1  thread1=new Thread1(counter);
        Thread2 thread2=new Thread2(counter);

       try {
           thread1.start();
           thread1.join();
           thread2.start();
           thread2.join();
       }catch (InterruptedException e)
       {
           e.printStackTrace();
       }
    }
}
