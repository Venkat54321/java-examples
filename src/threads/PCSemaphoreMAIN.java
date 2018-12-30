package threads;

import java.util.concurrent.Semaphore;

public class PCSemaphoreMAIN {

    public static void main(String[] args) {

        Semaphore semaphoreProd =new Semaphore(1);
        Semaphore semaphoreCons =new Semaphore(0);


        ProducerSemophore producerSemophore = new ProducerSemophore(semaphoreProd,semaphoreCons);
        ConsumerSemophore consumerSemophore = new ConsumerSemophore(semaphoreCons,semaphoreProd);

        Thread t1 = new Thread(producerSemophore);
        Thread t2 = new Thread(consumerSemophore);

        t1.start();
        t2.start();
    }
}
