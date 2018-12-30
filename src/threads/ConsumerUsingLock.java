package threads;

import java.util.List;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

public class ConsumerUsingLock implements Runnable {

    Lock lock;
    int size;
    List<Integer> list;
    Condition condition;

    public ConsumerUsingLock(Lock lock, int size,List<Integer> list,Condition condition) {
        this.lock = lock;
        this.size = size;
        this.list= list;
        this.condition = condition;

    }

    @Override
    public void run() {


        lock.lock();
        try {
            while (list.size() == 0) {
                System.out.println("Consumer is waiting for the producer........");
                condition.await();
            }
                System.out.println("CONSUMED " + list.remove(0));

            condition.signalAll();
        }catch (Exception e){
            System.out.println(e);
        }finally {
            lock.unlock();
        }

    }
}