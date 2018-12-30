package arrays;

public class SeparateEvenOddNumbers {

    public static void main(String[] args) {

        int[] array = {10,5,6,2,3,7,8,9,5};

        int i = 0;
        int j = array.length -1;

        while(i < j){

            if(array[i] % 2 != 0){
                array[j] = array[j] + array[i];
                array[i] = array[j] - array[i];
                array[j] = array[j] - array[i];

                j--;
            }else{
                i ++;
            }
        }

        for(int k : array){
            System.out.println(k);
        }
    }
}
