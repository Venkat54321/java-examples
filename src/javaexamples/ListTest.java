package javaexamples;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListTest {

    public static void main(String[] args) {
        Map<String,List<Integer>> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        list.add(null);
        list.add(null);

        map.put("test",list);

        List<Integer> dataList = map.get("test");
        dataList.add(6);
        map.put("test",dataList);

        List<Integer> list2 = map.get("test");
        System.out.println(list2);
    }
}
