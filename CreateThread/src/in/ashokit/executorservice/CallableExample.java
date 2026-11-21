package in.ashokit.executorservice;

import java.util.concurrent.*;

public class CallableExample {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService service= Executors.newSingleThreadExecutor();

        Callable<Integer> callable=()->{
            int a=10;
            int b=20;
            return a+b;
        };

        Future<Integer> submit = service.submit(callable);
        Integer i = submit.get();
        System.out.println(i);
    }
}
