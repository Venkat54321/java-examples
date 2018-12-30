package string;


interface I1{
void m1();
}
interface I2{
void m2();
}
class A implements I1,I2{

    public void m1() {
        System.out.println("m1");
    }

    public void m2() {
        System.out.println("m2");
    }

    final public void m3(){
        System.out.println("m3");
    }
}
class B extends A{

}


public class StringTest {

    public static void main(String[] args) {
        A a = new A();
        a.m2();
    }
}
