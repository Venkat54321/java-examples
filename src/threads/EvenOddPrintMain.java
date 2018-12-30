package threads;

import java.util.concurrent.atomic.AtomicInteger;

public class EvenOddPrintMain {

    public static void main(String[] args) {


        AtomicInteger atomicInteger = new AtomicInteger(1);
        Object lock = new Object();

        Thread eveThread = new Thread(new EvenThread(atomicInteger,lock));
        eveThread.setName("EVEN");
        Thread oddThread = new Thread(new OddThread(atomicInteger,lock));
        oddThread.setName("ODD");

        eveThread.start();
        oddThread.start();

    /*    AtomicInteger atomicInteger = new AtomicInteger(1);
        Object lock = new Object();
        Data data = new Data(atomicInteger, lock);

        Thread odd = new Thread(new Task(data, 1), "Odd");
        Thread even = new Thread(new Task(data, 0), "Even");
        odd.start();
        even.start();*/


    }
}
