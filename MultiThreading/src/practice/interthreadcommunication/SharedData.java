package practice.interthreadcommunication;

public class SharedData {
    private int value;
    private boolean available = false;

    public synchronized int getValue() throws InterruptedException {
        while (!available)
        {
            wait();
        }
        available=false;
        return value;
    }

    public synchronized void setValue(int value) {
        this.value = value;
        available=true;
        notify();
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}
