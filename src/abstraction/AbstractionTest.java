package abstraction;

abstract class Test{

    public Test(){
        System.out.println("Hello");
    }
    public void display(int s){
        System.out.println("Display message" + s);

    }
    public static void m1(){

    }

    public abstract void display1();
}


public class AbstractionTest extends Test{

    public static void main(String[] args) {

        Test obj = new AbstractionTest();
        obj.display(4);
        obj.display1();
        AbstractionTest.m1();

    }

    @Override
    public void display1() {
        System.out.println("Display 1 method");
    }
}
