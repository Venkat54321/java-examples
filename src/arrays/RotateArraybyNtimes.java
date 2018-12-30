package arrays;

public class RotateArraybyNtimes {

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9};
        int rotation = 2;
        for(int i=1;i<=rotation;i++){
            int lastElement = array[array.length-1];
            for(int j=array.length-1;j>=1;j--){
                array[j] = array[j-1];
            }
            array[0] = lastElement;
        }

        for(int i : array){
            System.out.println(i);
        }
    }
}
