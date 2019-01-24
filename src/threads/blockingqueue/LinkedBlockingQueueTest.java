package threads.blockingqueue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class LinkedBlockingQueueTest {

    public static void main(String[] args) {
        BlockingQueue<Integer> blockingQueue = new LinkedBlockingQueue<>(2);
        blockingQueue.add(1);
        blockingQueue.add(2);
        blockingQueue.remove();
        blockingQueue.add(3);

        System.out.println(blockingQueue);

    }
}
