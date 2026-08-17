package executorframework.filetask;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FileTask {
    static void task(String file)
    {
        System.out.println("File : "+file+" "+Thread.currentThread().getName());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public static void main(String[] args) {
        ExecutorService service= Executors.newFixedThreadPool(3);
        service.submit(()->task("report.pdf"));
        service.submit(()->task("photo.jpg"));
        service.submit(()->task("data.csv"));
        service.submit(()->task("resumr.pdf"));
        service.submit(()->task("invoice.pdf"));

        service.shutdown();
    }
}
