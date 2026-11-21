package in.ashokit.producer_consumer;

public class Producer extends Thread{
    SharedData sharedData;

    public Producer(SharedData sharedData) {
        this.sharedData = sharedData;
    }

    @Override
    public void run() {
        for(int i=0;i<5;i++)
        {
            try {
                sharedData.produce(i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
