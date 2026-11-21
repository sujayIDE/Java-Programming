package in.ashokit.counter;

public class Counter {

    int count=0;

    public synchronized void increment()
    {
        count++;
        System.out.println(Thread.currentThread().getName()+"->"+count);
    }
}
