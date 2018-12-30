package threads;

import java.util.concurrent.atomic.AtomicInteger;

public class Data {
    private AtomicInteger atomicInteger;
    private Object lock;

    public Data(AtomicInteger atomicInteger, Object lock) {
        this.atomicInteger = atomicInteger;
        this.lock = lock;
    }

    public void print(String thread, int threadId) {
        while (true) {
            try {
                Thread.sleep(1000);
                synchronized (lock) {
                    if (atomicInteger.get() % 2 != threadId) lock.wait();
                    else {
                        System.out.println(thread + ", " + atomicInteger.getAndIncrement());
                        lock.notifyAll();
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
