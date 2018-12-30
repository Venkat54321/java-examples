package examples;

import java.util.Arrays;

public class MergeTwoArraysMethod3 {

    public static void main(String[] args) {
        int[] array1 = {1,2,3,4,5,6,4};
        int[] array2 = {4,5,6,7,8,9,10};
        int[] array3 = new int[array1.length + array2.length];

        int i=0,k =0,j=0;
        while(i<array1.length){
            array3[k] = array1[i];
            i++;
            k++;
        }
        while(j<array2.length){
            array3[k] = array2[j];
            j++;
            k++;
        }

        Arrays.sort(array3);
        for(int l:array3){
            System.out.println(l);
        }
    }
}
