class Mythread1 extends Thread{
    Thread thread2;

    public void setThread2(Thread thread2) {
        this.thread2 = thread2;
    }

    @Override
    public void run() {
        for(int i=1;i<=10;i++)
        {
            System.out.println("i: "+i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class Mythread2 implements Runnable{
    @Override
    public void run() {
        for(int j=11;j<=200;j++){
            System.out.println("j: "+j);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
public class Demo {
    public static void main(String[] args) {
        Mythread1 mythread1=new Mythread1();
        mythread1.start();

        Mythread2 mythread2=new Mythread2();
        Thread thread2=new Thread(mythread2);
        mythread1.setThread2(thread2);
        thread2.setDaemon(true);
        thread2.start();

    }
}
