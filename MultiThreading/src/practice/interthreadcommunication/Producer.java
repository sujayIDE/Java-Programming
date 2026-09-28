package practice.interthreadcommunication;

public class Producer extends Thread{
    SharedData  sharedData;

    public Producer(SharedData sharedData) {
        this.sharedData = sharedData;
    }

    @Override
    public void run() {
        sharedData.setValue(100);
    }
}
