package arrays;

import java.util.Arrays;

public class SortKValuesAscOrder {

    public static void main(String[] args) {
        int[] array = {5, 4, 6, 2, 1, 3, 8, 9, -1};

        Arrays.sort(array);

        int i = 4;
        int j = array.length -1;
        while(i < j){

            array[j] = array[j] + array[i];
            array[i] = array[j] - array[i];
            array[j] = array[j] - array[i];

            i++;
            j--;
        }

        for(int k : array){
            System.out.println(k);
        }
    }
}
