package javatest;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapTest {

    public static void main(String[] args){

        Comparator comparator = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return 0;
            }
        };


        TreeMap<Integer, Integer> treeMap = new TreeMap<Integer, Integer>(comparator);

        treeMap.put(1,3);

        treeMap.put(10,5);

        treeMap.put(3,7);

        System.out.print(treeMap);

    }
}
