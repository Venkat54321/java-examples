package overloading;

class A{
    int x = 10;
}
class B extends  A{
    int x = 11;
}


public class OperatorOverloading extends B {

    public static void main(String[] args) {
        B b = new B();
        System.out.println(b.x);
    }
}
