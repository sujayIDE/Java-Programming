package practice.basic;

public class Join {
        public static void main(String[] args) throws InterruptedException {
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

            thread1.start();
            thread1.join();
            System.out.println("Main thread complete");
        }
    }

