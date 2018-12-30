package sorting;

public class SelectionSort {

    public static void main(String[] args) {
        int[] array = {14,2,6,9,13,10,45,1};
        for(int i=0;i<array.length -1;i++){
            int  minumElementIndex = getMinumElement(array,i);
            int tmp = array[minumElementIndex];
            array[minumElementIndex] = array[i];
            array[i] = tmp;

        }

        for(int i:array){
            System.out.println(i);
        }
    }

    public static int getMinumElement(int[] array,int i){

        int minValue = i;

        for(int j=i+1;j<array.length;j++){
            if(array[j] < array[minValue]){
                minValue = j;
            }
        }

        return minValue;

    }
}
