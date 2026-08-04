package executorframework.proper;

public class MyTask implements Runnable{
    private int tasknumber;

    public MyTask(int tasknumber) {
        this.tasknumber = tasknumber;
    }

    @Override
    public void run() {
        System.out.println("Task = "+tasknumber+
                "executed by = "+Thread.currentThread().getName());
    }
}
