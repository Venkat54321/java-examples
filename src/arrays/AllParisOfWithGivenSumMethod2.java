package arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class AllParisOfWithGivenSumMethod2 {

    public static void main(String[] args) {
        int[] array = {5,8,3,4,2,6,10,7,1,9};
        int sum = 11;
        printPairs(array,sum);
    }

    public static void printPairs(int[] array,int sum){

        Set<Integer> hashSet = new HashSet<>();

        for(Integer i : array){
            int value = sum - i;
            if(hashSet.contains(value)){
                System.out.println("Pairs are  :"+ i +" and "+ value);
            }else{
                hashSet.add(i);
            }
        }

    }
}
