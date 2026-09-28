package practice.producerconsumer;

public class Consumer extends Thread{
    SharedData sharedData;

    public Consumer(SharedData sharedData) {
        this.sharedData = sharedData;
    }

    @Override
    public void run() {
        for(int i=1;i<=100;i++)
        {
            try {
                sharedData.consumer();
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
