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


public class AbstactionTest extends Test{

    public static void main(String[] args) {

        Test obj = new AbstactionTest();
        obj.display(4);
        AbstactionTest.m1();

    }

    @Override
    public void display1() {
        System.out.println("Display 1 method");
    }
}
