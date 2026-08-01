package in.executorframework;

import com.sujay.bankaccount.Thread1;

import java.util.concurrent.*;

public class Test {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        /*Runnable runnable=()->{
            int x=10+30;
            System.out.println(x);
        };

        ExecutorService service= Executors.newSingleThreadExecutor();
        service.execute(runnable);
        service.shutdown();*/

        Callable callable=()->{
            return 10+10;
        };

        ExecutorService service=Executors.newSingleThreadExecutor();
        Future<Integer> future=service.submit(callable);
        System.out.println(future.isDone());
        System.out.println(future.isCancelled());
        int result=future.get();
        System.out.println(result);
        service.shutdown();


    }
}
