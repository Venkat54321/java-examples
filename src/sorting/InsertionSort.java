package sorting;

public class InsertionSort {

    public static void main(String[] args) {
        int[] array = {2,7,4,1,5,3};


        for(int i =1;i<array.length;i++){
            int j = i-1;
            int key = array[i];

            while(j>=0 && array[j] > key){

                array[j+1] = array[j];
                j = j-1;

            }
            array[j+1] = key;
        }

        for(int i : array){
            System.out.println(i);
        }
    }
}
