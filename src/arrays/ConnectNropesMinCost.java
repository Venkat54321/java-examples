package arrays;

import java.util.Arrays;

public class ConnectNropesMinCost {

    public static void main(String[] args) {
        int[] array = {4,3,2,6};

        Arrays.sort(array);

        int sum =0;
        int result = 0;

        sum = array[0] + array[1];
        result = sum;

        for(int i =2;i<array.length;i++){

            sum = sum + array[i];
            result = result + sum;
        }

        System.out.println(result);
    }
}
