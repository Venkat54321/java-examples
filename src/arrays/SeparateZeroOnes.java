package arrays;

public class SeparateZeroOnes {

    public static void main(String[] args) {
        int[] array = {0,1,0,1,0,1,0,1,0,1,0,1};

        int[] b = new int[array.length];

        int count = 0;
        for(int i =0;i<array.length;i++){
            if(array[i] == 0){
                b[i] = array[i];
                count ++;
            }
        }
        for(int i =0;i<array.length;i++){
            if(array[i] == 1){
                b[count++] = array[i];
            }
        }

        for(int i : b){
            System.out.println(i);
        }
    }
}
