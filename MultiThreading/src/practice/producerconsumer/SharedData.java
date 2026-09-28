package practice.producerconsumer;

import java.util.ArrayList;
import java.util.List;

public class SharedData {
    private List<Integer> integerList;
    private int capacity=10;

    public SharedData() {
        this.integerList = new ArrayList<>();
        this.capacity = 10;
    }

    public synchronized void produce(int i) throws InterruptedException {
        while (integerList.size()==capacity)
        {
            wait();
        }

        integerList.add(i);
        System.out.println("Element is produced : "+i);
        notify();
    }

    public synchronized void consumer() throws InterruptedException {
        while (integerList.isEmpty())
        {
            wait();
        }

        int i=integerList.removeLast();
        System.out.println("Element is consumed : "+i);
        notify();
    }
}
