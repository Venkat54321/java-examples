package goldmansch;

import java.util.LinkedHashMap;
import java.util.Map;

public class StringEncoding {

    public static void main(String[] args) {

        String s = "445";

        LinkedHashMap<Character,Integer>  map = new LinkedHashMap<>();

        for(int i=0;i<s.length();i++){

            if(!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),1);
            }else{
                map.put(s.charAt(i),map.get(s.charAt(i)) + 1);
            }
        }

        StringBuilder sb = new StringBuilder();
        for(Map.Entry<Character,Integer> m : map.entrySet()){
            sb.append(m.getValue()).append(m.getKey());
        }
        System.out.println(sb.toString());
    }
}
