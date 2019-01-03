package threads;

public class DeadLockThread1 implements Runnable {

    Object lock1;
    Object lock2;

    public DeadLockThread1(Object lock1, Object lock2) {
        this.lock1 = lock1;
        this.lock2 = lock2;
    }

    @Override
    public void run() {

        synchronized (lock1){
            System.out.println("Thead-1 got lock with lock1");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (lock2){
                System.out.println("Thead-1 got lock with lock12");
            }
        }


    }
}
