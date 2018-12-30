package arrays;

public class IntersectionOfArrays {

    public static void main(String[] args) {
        int[] array1 = {1,3,4,5,7};
        int[] array2 = {2,3,5,6};

        int i=0,j=0;
        while (i<array1.length && j< array2.length){
            if(array1[i] == array2[j]){
                System.out.println(array1[i]);
            }if(array1[i] < array2[j]){
                i++;
            }else {
                j++;
            }
        }

    }
}
