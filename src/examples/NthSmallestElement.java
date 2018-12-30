package examples;

import java.util.Arrays;

public class NthSmallestElement {

    public static void main(String[] args) {

        int[] a = {10,2,30,45,28,26,13,6,9};

        //use merge sort
        Arrays.sort(a);

        System.out.println(a[4]);
    }
}
