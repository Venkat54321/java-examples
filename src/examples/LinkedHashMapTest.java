package examples;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapTest {

    public static void main(String[] args){
        Map<Integer,Integer> linkedHashMap = new LinkedHashMap<>();

        linkedHashMap.put(1,2);
        linkedHashMap.put(2,3);
        linkedHashMap.put(3,4);
        linkedHashMap.put(4,4);
        linkedHashMap.put(5,4);
        linkedHashMap.put(6,4);

        System.out.print(linkedHashMap);

    }
}
