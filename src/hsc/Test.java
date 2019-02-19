package hsc;


public class Test {

    public static void main(String[] args) {
        int n = 10;
        int[] array = {2,3,5,4,1,9,8,10,6};
        int totalSum = n * (n + 1)/ 2;
        int currentSum = 0;
        for(int i : array){
            currentSum = currentSum + i;
        }
        System.out.println("missing num is "+(totalSum - currentSum));

    }
}
