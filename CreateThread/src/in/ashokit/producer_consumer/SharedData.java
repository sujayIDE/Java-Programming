package in.ashokit.producer_consumer;

public class SharedData {
    private int value;
    private boolean isAvailable=false;

    public synchronized void produce(int value) throws InterruptedException {
        while (isAvailable)
        {
            wait();
        }

        this.value=value;
        isAvailable=true;

        System.out.println("Produced : "+value);
        notify();
    }

    public synchronized void consume() throws InterruptedException {
        while (!isAvailable)
        {
            wait();
        }

        int data=value;
        isAvailable=false;
        System.out.println("consumer : "+data);
        notify();
    }
}
