package abstraction;

public interface TestInterface {

    void test();

    default void test1(){
        System.out.println("Hello test1");
    }
}
