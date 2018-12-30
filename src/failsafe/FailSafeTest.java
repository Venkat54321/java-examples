package failsafe;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FailSafeTest {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.add(2);
        list.add(3);
        list.add(4);

        /*for (Integer i : list){
            System.out.println(i);
            //list.add(5);
        }*/

        Iterator<Integer> iterable = list.iterator();

        while (iterable.hasNext()){
            System.out.println(iterable.next());
            list.remove(1);
        }

    }
}
