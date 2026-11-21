package in.ashokit.producer_consumer;

public class Consumer extends Thread{
    SharedData sharedData;

    public Consumer(SharedData sharedData) {
        this.sharedData = sharedData;
    }

    @Override
    public void run() {
        for(int i=0;i<5;i++)
        {
            try {
                Thread.sleep(5000);
                sharedData.consume();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
