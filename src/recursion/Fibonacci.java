package recursion;

public class Fibonacci {

    public static void main(String[] args) {
        fibSeries(0,1);
    }

    public static void fibSeries(int a,int b){
            int c = a+b;
            if(c > 30){
                return;
            }
            System.out.println(c);
            a = b;
            b = c;
            fibSeries(a,b);
        }
}
