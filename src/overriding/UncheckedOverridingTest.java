package overriding;


import java.io.IOException;

class ClassAB{

    int i = 10;

    ClassAB(){

    }

    void m1() throws IOException{

        System.out.println("in m1 method");
    }
}
class ClassAC extends ClassAB {


    public void m2() throws IOException {
        System.out.println(i);
        super.m1();
    }
}


public class UncheckedOverridingTest {

    public static void main(String[] args) throws Exception {
        ClassAC ac = new ClassAC();
        ac.m2() ;
    }
}
