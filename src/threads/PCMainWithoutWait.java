package threads;

import java.util.Vector;

public class PCMainWithoutWait {

    public static void main(String[] args) {

        ProducerWithoutWait prod = new ProducerWithoutWait();
        ConsumerWithoutWait cons = new ConsumerWithoutWait(prod);

        Thread t1 = new Thread(prod);
        Thread t2 = new Thread(cons);

        t1.start();
        t2.start();


    }
}
