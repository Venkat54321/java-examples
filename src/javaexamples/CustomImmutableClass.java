package javaexamples;

import java.util.ArrayList;
import java.util.List;

public final class CustomImmutableClass {

   final int id;
   final String name;
   final List<Integer> list;

   public CustomImmutableClass(int id,String name,List<Integer> list){
       this.id = id;
       this.name = name;
       this.list = getList(list);
   }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Integer> getList() {
        return getList(list);
    }

    private List<Integer> getList(List<Integer> list) {
       List<Integer> integerList = new ArrayList<>();
       for (Integer integer : list)
           integerList.add(integer);
       return integerList;
    }
}
