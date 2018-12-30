package arrays;

import java.util.HashMap;
import java.util.Map;

public class Test {

    public static void main(String[] args) {

        String s = "Hello";
        char[] c = s.toCharArray();

        Map<Character,Integer> map = new HashMap<>();

        for(int i =0;i<s.length();i++){
            Integer value = map.get(c[i]);
            if(value == null){
                map.put(c[i],1);
            }else{
                map.put(c[i],value + 1);
            }
        }

        System.out.println(map);

    }
}
