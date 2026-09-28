package practice.basic;

public class Test {
    public static void main(String[] args) {
        Thread thread1 = new Thread(()->{
            for(int i=1;i<=5;i++)
            {
                System.out.println("i="+i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        );

        Thread thread2=new Thread(()->{
            for(int i=6;i<=10;i++){
                System.out.println("j="+i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        thread1.start();
        thread2.start();
    }
}
