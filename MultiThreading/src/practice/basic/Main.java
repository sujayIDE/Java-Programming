package practice.basic;

public class Main {
    public static void main(String[] args) {
        MyThread mythread=new MyThread();
        Thread t=new Thread(mythread);
        t.run();
        t.start();
    }
}
