package threads;

import java.util.concurrent.Semaphore;

public class ProducerSemophore implements Runnable {

    Semaphore semaphoreProd;
    Semaphore semaphoreCons;

    public ProducerSemophore(Semaphore semaphoreProd, Semaphore semaphoreCons) {
        this.semaphoreProd = semaphoreProd;
        this.semaphoreCons = semaphoreCons;
    }

    @Override
    public void run() {

        try {
            for (int i = 0; i < 10; i++) {
                semaphoreProd.acquire();
                System.out.println("Produce " + i);
                semaphoreCons.release();
            }
        }catch (InterruptedException e){
            System.out.println(e);
        }
    }
}
