package practice.racecondition;

public class Thread1 extends Thread{
    Counter counter;

    public Thread1(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for(int i=1;i<=1000;i++)
        {
            counter.increment();
        }
    }
}
