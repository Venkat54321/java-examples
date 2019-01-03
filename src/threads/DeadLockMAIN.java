package threads;

public class DeadLockMAIN {

    public static void main(String[] args) {

        Object lock1  = new Object();
        Object lock2 = new Object();

        Thread t1 = new Thread(new DeadLockThread1(lock1,lock2));
        Thread t2 = new Thread(new DeadLockThread2(lock1,lock2));

        t1.start();
        t2.start();
    }

}
