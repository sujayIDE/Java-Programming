package in.ashokit.producer_consumer;

public class MainClass {
    public static void main(String[] args) {
        SharedData sharedData=new SharedData();

        Producer producer=new Producer(sharedData);
        Consumer consumer=new Consumer(sharedData);

        producer.start();
        consumer.start();
    }
}
