package string;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReverseLine {
    public static void main(String[] args){
        String line ="Hello how Hello you!";

        String[] lines = line.split(" ");
        Map<String,Integer> map = new HashMap<>();

        for(String s : lines){
            if(map.get(s) == null){
                map.put(s,1);
            }else{
                Integer i = map.get(s);
                map.put(s,i +1);
            }
        }
        System.out.print(map);

    }
}
