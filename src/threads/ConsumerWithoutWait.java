package threads;

import java.util.Vector;

public class ConsumerWithoutWait implements Runnable {

    ProducerWithoutWait prod;

    ConsumerWithoutWait(ProducerWithoutWait prod){
        this.prod = prod;
    }

    @Override
    public void run() {

        while (this.prod.isInProcess){

            System.out.println("Consumer waiting for production to get over.");
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

        System.out.println("Production is over, consumer can consume");
        int size = this.prod.sharedList.size();
        for(int i =0;i<size;i++) {
            System.out.println("Consuming " + this.prod.sharedList.remove(0));
        }

    }
}
