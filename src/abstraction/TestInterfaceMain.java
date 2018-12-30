package abstraction;

public class TestInterfaceMain implements TestInterface,TestInterface1{

    public static void main(String[] args) {

        TestInterface obj = new TestInterfaceMain();
        TestInterface1.test1();
        obj.test1();

    }

    @Override
    public void test() {


    }
}
