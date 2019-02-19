package alcatraz;

import java.util.*;

public class Test {

    public static void main(String[] args) {
      //  String str = "it is a pleasant day today";
        String str = "hey";

        String s = longestEven(str);
        System.out.println(s);

    }

    public static String longestEven(String str){

        Map<String,Integer> map = new LinkedHashMap<>();

        List<String> list = Arrays.asList(str.split(" "));

        for(String s : list){
            if(s.length()% 2 ==0) {
                map.put(s, s.length());
            }
        }
        if(map.size() > 0) {
            Set<String> keySey = map.keySet();
            Integer max = Integer.MIN_VALUE;
            for (String strNew : keySey) {
                if (max < map.get(strNew)) {
                    max = strNew.length();
                }
            }
            for (String str1 : keySey) {
                if (map.get(str1).equals(max)) {
                    return str1;
                }
            }
        }
        return null;
    }

}
