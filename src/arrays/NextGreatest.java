package arrays;

public class NextGreatest {

    public static void main(String[] args) {

        int[] array = {16, 17, 4, 3, 5, 2};
        for(int i : array){
            System.out.print(i);
        }
        nextGreatest(array);
        System.out.println();
        for(int i : array){
            System.out.println(i);
        }
    }

    static void nextGreatest(int[] array){

        int size = array.length;
        int max_From_right = array[size-1];
        array[size -1 ] = -1;
        for(int i = size -2;i>=0;i--){
            int temp = array[i];
            array[i] = max_From_right;
            if(max_From_right < temp){
                max_From_right = temp;
            }
        }

    }
}
