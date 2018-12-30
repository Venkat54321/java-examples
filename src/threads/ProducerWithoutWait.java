package threads;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class ProducerWithoutWait implements Runnable {

    List<Integer> sharedList;
    Boolean isInProcess;

    ProducerWithoutWait(){
        sharedList = new ArrayList<>();
        isInProcess = true;
    }

    @Override
    public void run() {

        for(int i =1;i<10;i++){
            System.out.println("Produced ..."+ i);
            sharedList.add(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        isInProcess = false;

    }
}