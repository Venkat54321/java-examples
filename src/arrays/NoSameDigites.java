package arrays;

import java.util.ArrayList;
import java.util.List;

public class NoSameDigites {

    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        int q = 3;
        List<Integer> list = new ArrayList<>();

        while(x < y){
            list.add(x *q);
            x++;
        }

        list.add(44);
        int sameCount = 0;
        for(Integer i : list) {
            Boolean check = checkSameDigits(i);
            if (check) {
                sameCount++;
            }
        }

        System.out.println(sameCount);

    }

    static Boolean checkSameDigits(Integer value){
        String s = value.toString();
        char[] chars = s.toCharArray();

        for(int i =0;i<chars.length-1;i++){
            if(chars[i] != chars[i+1]){
                return false;
            }
        }

        return true;

    }
}
