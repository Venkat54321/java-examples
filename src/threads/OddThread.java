package threads;

import java.util.concurrent.atomic.AtomicInteger;

public class OddThread implements Runnable {

    AtomicInteger n;
    Object lock;

    OddThread(AtomicInteger n, Object lock){
        this.n = n;
        this.lock = lock;
    }

    @Override
    public void run() {
            synchronized (lock) {

                while (true) {
                    if (n.get() % 2 == 0) {

                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    } else {
                        System.out.println("Odd " + n);
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        n.incrementAndGet();
                        lock.notifyAll();
                    }
                }
            }
        }

}
