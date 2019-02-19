package sorting;

public class BubbleSort1 {

    public static void main(String[] args) {
        int[] array = {2,9,3,5,6,12,15,17,10};
        sort(array);

        for(int i : array){
            System.out.print(i +"   ");
        }
    }

    public static void sort(int[] array){

        for(int i=0;i<array.length;i++){
            for(int j=0;j<array.length-i-1;j++){
                if(array[j]>array[j+1]){
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                }
            }
        }

    }
}
