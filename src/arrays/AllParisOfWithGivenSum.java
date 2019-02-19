package arrays;

import java.util.Arrays;

public class AllParisOfWithGivenSum {

    public static void main(String[] args) {
        int[] array = {5,8,3,4,2,6,10,7,1,9};
        Arrays.sort(array);
        System.out.println();
        int sum = 11;
        Arrays.sort(array);
        printPairs(array,sum);
    }

    public static void printPairs(int[] array,int sum){

        int l = 0;
        int k = array.length -1;
        while(l< k){
            if(array[l] + array[k] > sum){
                k--;
            }else if(array[l] + array[k] < sum){
                l++;
            }else{
                System.out.println("Pairs are  :"+ array[l] +" and "+ array[k]);
                l++;
            }
        }

    }
}
