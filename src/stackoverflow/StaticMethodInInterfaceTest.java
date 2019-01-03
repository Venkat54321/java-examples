package stackoverflow;

interface StaticInterface{
    static void m1(){
        System.out.println("m1 method");
    }

   default void m2(){
       System.out.println("m2 method");
    }
}

public class StaticMethodInInterfaceTest implements StaticInterface{

    public static void main(String[] args) {
        StaticInterface obj = new StaticMethodInInterfaceTest();
        obj.m2();
        StaticInterface.m1();
    }
}
