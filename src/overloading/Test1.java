package overloading;


public class Test1 {

    public static void test(Object o){

        System.out.println("Object class");
    }

    public static int test(String a){

        System.out.println("A class");
        return 0;
    }

    public static void main(String[] args) {

       Test1.test(null);
    }
}
