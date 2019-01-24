package recursion;

public class SumNumbers {

    public static void main(String[] args) {
        int s = sum(10);
        System.out.println(s);
    }

    public static int sum(int n){
        if(n <=0){
            return 0;
        }
        else return n + sum(n-1);
    }
}
