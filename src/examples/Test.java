package examples;

import java.io.IOException;

class A {

    public void method1() throws Exception {
        System.out.print("Method A");
    }
}
class B extends A{

    public void method1() throws IOException{
        System.out.print("Method B");
    }

    public void method3(){
        System.out.print("Method B");
    }

}

public class Test{

    public static void main(String[] args) throws Exception{
        A a = new B();
        a.method1();
    }

}
