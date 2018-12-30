package threads;

import java.util.List;
import java.util.Vector;

public class Consumer implements Runnable {


    List sharedQueue;
    Integer size;

    public Consumer(List sharedQueue, Integer size) {
        this.sharedQueue = sharedQueue;
        this.size = size;
    }

    @Override
    public void run() {

        while (true) {
            try {
                 synchronized (sharedQueue) {
                while (sharedQueue.isEmpty()) {
                    System.out.println("Queue is empty " + Thread.currentThread().getName()
                            + " is waiting , size: " + sharedQueue.size());
                    sharedQueue.wait();
                }
                System.out.println("Consumed: " + sharedQueue.remove(0));
                sharedQueue.notify();
            }
                Thread.sleep(50);
            } catch (InterruptedException ex) {
            }

        }

    }

    private int consume() throws InterruptedException {
        //wait if queue is empty
        synchronized (sharedQueue) {
        while (sharedQueue.isEmpty()) {
                System.out.println("Queue is empty " + Thread.currentThread().getName()
                        + " is waiting , size: " + sharedQueue.size());
                sharedQueue.wait();
            }
        }

        //Otherwise consume element and notify waiting producer
        synchronized (sharedQueue) {
            sharedQueue.notifyAll();
            return (Integer) sharedQueue.remove(0);
        }
    }

}
