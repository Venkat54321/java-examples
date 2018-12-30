package threads;

import java.util.concurrent.Semaphore;

public class ConsumerSemophore implements Runnable {

    Semaphore semaphoreProd;
    Semaphore semaphoreCons;

    public ConsumerSemophore(Semaphore semaphoreCons, Semaphore semaphoreProd) {
        this.semaphoreProd = semaphoreProd;
        this.semaphoreCons = semaphoreCons;
    }

    @Override
    public void run() {

        try {

            for (int i = 0; i < 10; i++) {
                semaphoreCons.acquire();
                System.out.println("Consumer " + i);
                semaphoreProd.release();
            }
        }catch (InterruptedException e){
            System.out.println(e);
        }
    }
}
