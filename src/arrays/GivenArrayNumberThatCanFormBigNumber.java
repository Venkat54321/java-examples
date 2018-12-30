package arrays;

import java.util.*;

public class GivenArrayNumberThatCanFormBigNumber {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        //54, 546, 548, 60
        list.add("54");
        list.add("546");
        list.add("548");
        list.add("60");

        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String xy = o1+o2;

                String yx = o2+o1;

                return yx.compareTo(xy) >0?1:-1;
            }
        });
        Iterator it = list.iterator();

        while(it.hasNext())
            System.out.print(it.next());
    }
}
