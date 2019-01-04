package overriding;

class SuperClass{
     SuperClass(){
        System.out.println("Super Class Const");
    }
}

public class CallingSuperClassConst extends SuperClass {

    public static void main(String[] args) {
        new CallingSuperClassConst();
    }
}
