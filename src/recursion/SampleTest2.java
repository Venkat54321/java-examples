package recursion;

public class SampleTest2 {
    public static void main(String[] args) {
        test(10);
    }

    private static void test(int n){
        if(n > 0){
            for(int i=0;i<n;i++){
                System.out.print(" "+n);
            }
            System.out.println("");
            test(n-1);
        }
    }
}
