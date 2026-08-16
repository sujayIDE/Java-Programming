package lambda.thread.synchronization;

public class Demo {
    public static void main(String[] args) {
        Object object=new Object();
        Runnable r=()->{
            synchronized (object)
            {
                for(int i=1;i<=10;i++)
                {
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                    }
                    System.out.println(Thread.currentThread().getName()+"->"+i);
                }
            }
        };

        Thread thread1=new Thread(r);
        Thread thread2=new Thread(r);
        thread1.start();
        thread2.start();
    }
}
