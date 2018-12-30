package threads;

import java.util.*;

public class ProducerConsumerMAIN {


    public static void main(String[] args) {

        List<Integer> sharedQueue = new ArrayList<>();
        int size = 10;

        Thread consumer = new Thread(new Consumer(sharedQueue,size));
        Thread producer = new Thread(new Producer(sharedQueue,size));

        producer.start();
        consumer.start();

        System.out.println(Thread.currentThread().getName() + " is finished.");
    }
}
