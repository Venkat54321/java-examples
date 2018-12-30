package arrays;

public class MergeTwoSortedArray {

    public static void main(String[] args) {

        int[] array1 = {1, 3, 4, 5};
        int[] array2 = {2, 4, 6, 8};
        int[] array3 = new int[array1.length + array2.length];

        for (int i = 0; i < array1.length;i++){
            array3[i] = array1[i];
        }

        for(int j=0;j< array2.length;j++){




        }

        for(int i : array3){
            System.out.println(i);
        }
    }

}
