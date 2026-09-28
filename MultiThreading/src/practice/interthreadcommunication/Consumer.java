package practice.interthreadcommunication;

import practice.synchronization.Thread2;

public class Consumer extends Thread {
    SharedData sharedData;

    public Consumer(SharedData sharedData) {
        this.sharedData = sharedData;
    }

    @Override
    public void run() {
        int value= 0;
        try {
            value = sharedData.getValue();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        if(value!=0)
        {
            System.out.println(value);
        }
    }
}
