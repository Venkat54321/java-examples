package threads.customthreadpool;

public class Task implements Runnable {

    @Override
    public void run() {

        try{
            Thread.sleep(1000);
            System.out.println("Task Executing....."+Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
