package arrays;

import java.util.HashSet;
import java.util.Set;

public class ReplaceDuplicateValueGreaterThenPreviousVal {

    public static void main(String[] args) {

        int[] array = {9, 9, 9, 9, 9};
        int[] newArray = getDuplicateValue(array);
        for(int i : newArray){
            System.out.println(i);
        }
    }

    static int[] getDuplicateValue(int[] array){
        Set<Integer> set = new HashSet<>();

        for(int i =0;i<array.length;i++){

            if(set.contains(array[i])){
                int value = array[i-1];
                array[i] = ++value;
            }else{
                set.add(array[i]);
            }
        }

        return array;
    }
}
