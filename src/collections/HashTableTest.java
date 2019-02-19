package collections;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

public class HashTableTest {

    public static void main(String[] args) {
        Map<Integer,Integer> map = new Hashtable<>();

        map.put(1,2);
        map.put(1,3);
        map.put(3,3);

      //  System.out.println(map);

        //int i = getIntValue();
       // System.out.println(i);
        checkArrayList();
    }

    public static int getIntValue(){

        try{
            System.out.println("Inside try");
            throw  new ArithmeticException();
        }catch (Exception e){
            System.out.println("Inside catch");
            e.printStackTrace();
            return 4;
        }finally {
            System.out.println("Inside finally");
            return 10;
        }
    }

    public static void checkArrayList(){

        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(list);

        list.remove(3);

        System.out.println(list);
    }
}
