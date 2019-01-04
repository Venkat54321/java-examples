package overriding;

class ClassA{

}
class ClassB {

}
class ClassC extends ClassB{

}

public class MainClass {

    static void overloadedMethod(ClassA b){

        System.out.println("ONE");
    }
    static void overloadedMethod(ClassB b){

        System.out.println("TWO");
    }
    static void overloadedMethod(Object b){

        System.out.println("THREE");
    }

    public static void main(String[] args) {

        ClassC c = new ClassC();
        overloadedMethod(c);
    }
}
