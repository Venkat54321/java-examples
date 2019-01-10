package javaexamples;

import java.util.ArrayList;
import java.util.List;

public class TestImmutable {

    public static void main(String[] args) {

        int i = 10;
        String name= "venkat";
        List<Integer> list = new ArrayList<>(); // ref=1022

        list.add(2);
        list.add(3);
        list.add(4);

        CustomImmutableClass customImmutableClass = new CustomImmutableClass(i,name,list);

        CustomImmutableClass test = customImmutableClass;

        System.out.println(test.id);
        System.out.println(test.name);
        System.out.println(test.list);
        list.add(5);

        System.out.println("====================");
        System.out.println(test.id);
        System.out.println(test.name);
        System.out.println(test.list);

        //
        List<Integer> list1 = test.getList();

        list1.add(6);

        System.out.println("====================");
        System.out.println(test.id);
        System.out.println(test.name);
        System.out.println(test.list);
    }
}
