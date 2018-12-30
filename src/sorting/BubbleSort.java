package sorting;

public class BubbleSort {

    public static void main(String[] args) {
        int[] array = {14,2,6,9,13,10,45,1};

        for(int i=0;i<array.length -1;i++){
            for(int j=0;j<array.length-i-1;j++){

                if(array[i] > array[j+1]){

                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                }

            }
        }

        for(int i : array){
            System.out.println(i);
        }

    }

}
