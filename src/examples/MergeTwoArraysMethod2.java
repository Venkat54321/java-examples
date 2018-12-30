package examples;

import java.util.HashMap;
import java.util.Map;

public class MergeTwoArraysMethod2 {

    public static void main(String[] args) {
        int[] array1 = {1,2,3,4,5,6};
        int[] array2 = {4,5,6,7,8,9,10};
        //result {1,2,3,4,5,6,7,8,9,10}

        Map<Integer,Integer> map = new HashMap<>();

        for(int i : array1){
            Integer count =  map.get(i);
            if(count == null){
                map.put(i,1);
            }else{
                map.put(i,count + 1);
            }
        }

        for(int i : array2){
            Integer count =  map.get(i);
            if(count == null){
                map.put(i,1);
            }else{
                map.put(i,count + 1);
            }
        }

        System.out.println(map.keySet());
    }
}
