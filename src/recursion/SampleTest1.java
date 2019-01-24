package recursion;

public class SampleTest1 {

    public static void main(String[] args) {
        test(10);
    }

    private static void test(int i){
        if(i>0){
            System.out.println(i);
            test(i-1);
        }
    }
}
