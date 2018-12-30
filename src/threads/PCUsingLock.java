package threads;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class PCUsingLock {

    public static void main(String[] args) {

        Lock lock = new ReentrantLock();
        int size = 3;
        Condition prodCondition = lock.newCondition();
       // Condition consCondition = lock.newCondition();

        List<Integer> list = new ArrayList<>();

        Thread producer = new Thread(new ProducerUsingLock(lock,size,list,prodCondition));
        Thread consumer = new Thread(new ConsumerUsingLock(lock,size,list,prodCondition));

        producer.start();
        consumer.start();

    }
}
