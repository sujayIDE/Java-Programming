package in.ashokit.executorservice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceExample {
    public static void main(String[] args) {
        ExecutorService service= Executors.newFixedThreadPool(3);

        Runnable runnable1=()->{
            System.out.println("Task 1 : "+Thread.currentThread().getName());
        };

        Runnable runnable2=()->{
            System.out.println("Task 2 : "+Thread.currentThread().getName());
        };

        Runnable runnable3=()->{
            System.out.println("Task 3 : "+Thread.currentThread().getName());
        };

        Runnable runnable4=()->{
            System.out.println("Task 4 : "+Thread.currentThread().getName());
        };

        Runnable runnable5=()->{
            System.out.println("Task 5 : "+Thread.currentThread().getName());
        };

        service.execute(runnable1);
        service.execute(runnable2);
        service.execute(runnable3);
        service.execute(runnable4);
        service.execute(runnable5);

        service.shutdown();

    }
}
