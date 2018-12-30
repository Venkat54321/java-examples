package arrays;

import java.util.Arrays;

public class FindNonDuplicate {

    public static void main(String[] args) {
        int[] array = {1,2,1,3,2,3,4,5,5};
        //OP : 4 -----> {1,1,2,2,3,3,4,5,5}

        int result = 0;
        for(int i=0;i<array.length;i++){
            result = result^array[i];
        }
        System.out.println(result);

    }
}
