package threads;

import java.util.concurrent.atomic.AtomicBoolean;

public class ThreadSafeConstructor {

    AtomicBoolean status = new AtomicBoolean(false);

    public ThreadSafeConstructor() throws InterruptedException {

        while (status.getAndSet(true)){
            Thread.sleep(1000);
        }
        status.getAndSet(false);

   }
}
