package recursion;

public class SumNumberInArray {

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        int sum = sum(array.length-1,array);
        System.out.println(sum);
    }

    public static int sum(int i,int[] array){
        if(i<0){
            return 0;
        }else
            return array[i] + sum(i-1,array);
    }
}
