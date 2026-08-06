package executorframework.proper;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleThreadExecutor {
    public static void main(String[] args) {
        ExecutorService executorService= Executors.newSingleThreadExecutor();
        for(int i=1;i<=10;i++)
        {
            executorService.submit(new MyTask(i));
        }
        executorService.shutdown();
    }

}
