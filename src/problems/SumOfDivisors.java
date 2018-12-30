package problems;

public class SumOfDivisors {

    public static void main(String[] args) {

        int result = 0;
        for(int i=1;i<=6;i++){
            if(6%i ==0){
                result  = result + i;
            }
        }
        System.out.println(result);
    }
}
