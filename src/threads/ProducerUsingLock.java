package threads;

import java.util.List;
import java.util.Random;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

public class ProducerUsingLock implements Runnable {

    Lock lock;
    int size;
    List<Integer> list;
    Condition condition;

    public ProducerUsingLock(Lock lock, int size,List<Integer> list,Condition condition) {
        this.lock = lock;
        this.size = size;
        this.list  = list;
        this.condition = condition;
    }

    @Override
    public void run() {

        lock.lock();
        try {

            for(int i =1;i < 20;i++) {
                while (list.size() == size) {
                    System.out.println("Producer is waiting for the consumer....");
                    condition.await();
                }

                list.add(i);
                System.out.println("PRODUCED" + i);
                condition.signalAll();
            }
        }catch (Exception e){
            System.out.println(e);
        }
        finally {
            lock.unlock();
        }

    }
}
