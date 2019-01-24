package recursion;

public class Factorial {

    public static void main(String[] args) {
        int i = fact(5);
        System.out.println(i);
    }

    public static int fact(int n){
        System.out.println("I'm calculating for number :" + n);
        if(n ==0){
            return 1;
        }
        else {
            int i =  n * fact(n-1);
            System.out.println("Done for "+ n +" : "+ i);
            return i;
        }
    }
}
