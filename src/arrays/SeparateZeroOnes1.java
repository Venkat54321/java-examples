package arrays;

public class SeparateZeroOnes1 {

    public static void main(String[] args) {

        int[] arr = {0, 1, 0, 1, 1, 1};

        int type0 = 0;
        int type1 = arr.length - 1;

        while (type0 < type1) {
            if (arr[type0] == 1) {
                // swap
                arr[type1] = arr[type1]+ arr[type0];
                arr[type0] = arr[type1]-arr[type0];
                arr[type1] = arr[type1]-arr[type0];
                type1--;
            } else {
                type0++;
            }
        }

        for(int i : arr){
            System.out.println(i);
        }
    }
}
