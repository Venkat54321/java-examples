package wrapper;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        List<Integer>  list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        Integer i = new Integer(10);
        i++;
        System.out.println( i);

        System.out.println(list);


    }
}
