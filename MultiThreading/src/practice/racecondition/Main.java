package practice.racecondition;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Counter counter=new Counter();

        Thread1 thread1=new Thread1(counter);
        Thread2 thread2=new Thread2(counter);

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("Final count : "+counter.getCount());

    }
}
