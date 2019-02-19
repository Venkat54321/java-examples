package array.practice;

import java.util.HashSet;
import java.util.Set;

public class ReplaceDuplicateValWithZero {

    public static void main(String[] args) {
        int[] array = {9,2,6,4,10,6,12,2,9};

        Set<Integer> set = new HashSet<>();

        for(int i=0;i<array.length;i++){
            if(set.contains(array[i])){
                array[i] = 0;
            }else{
                set.add(array[i]);
            }
        }

        for(int i: array){
            System.out.print(i +"  ");
        }
    }
}
