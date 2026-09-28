package practice.producerconsumer;

public class Producer extends Thread{
    SharedData sharedData;

    public Producer(SharedData sharedData) {
        this.sharedData = sharedData;
    }

    @Override
    public void run() {
        for(int i=1;i<=100;i++)
        {
            try {
                sharedData.produce(i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
