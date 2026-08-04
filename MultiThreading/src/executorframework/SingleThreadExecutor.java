package executorframework;

import java.util.concurrent.*;

public class SingleThreadExecutor {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
       Runnable runnable=()->{
           int x=10+30;
           System.out.println(x);
       };

       ExecutorService service=Executors.newSingleThreadExecutor();
       service.submit(runnable);
       service.shutdown();

        Callable <Integer> callable=() -> {
            return 10+20;
        };

        ExecutorService executorService=Executors.newSingleThreadExecutor();
        Future<Integer> future=executorService.submit(callable);
        int result=future.get();
        System.out.println(result);
        executorService.shutdown();
    }
}
