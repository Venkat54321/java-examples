package threads;


import java.util.List;
import java.util.Vector;

public class Producer implements Runnable {

    List sharedQueue;
    Integer size;

    public Producer(List sharedQueue, Integer size) {
        this.sharedQueue = sharedQueue;
        this.size = size;
    }

    @Override
    public void run() {


        for (int i = 1; i < 20; i++) {
            try {
                synchronized (sharedQueue) {
                    while (sharedQueue.size() == size) {
                        System.out.println("Queue is full " + Thread.currentThread().getName()
                                + " is waiting , size: " + sharedQueue.size());

                        sharedQueue.wait();
                    }
                    System.out.println("Produced: " + i);
                    sharedQueue.add(i);
                    sharedQueue.notifyAll();
                }
            } catch (InterruptedException ex) {
                System.out.println((Producer.class.getName()));
            }

        }
    }

    private void produce(int i) throws InterruptedException {

        //wait if queue is full
        synchronized (sharedQueue) {
        while (sharedQueue.size() == size) {
                System.out.println("Queue is full " + Thread.currentThread().getName()
                        + " is waiting , size: " + sharedQueue.size());

                sharedQueue.wait();
            }
        }

        //producing element and notify consumers
        synchronized (sharedQueue) {
            sharedQueue.add(i);
            sharedQueue.notifyAll();
        }
    }


}
