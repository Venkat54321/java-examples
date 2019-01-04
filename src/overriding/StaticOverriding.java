package overriding;

class AZ{

    static void m1(){
        System.out.println("AZ");
    }

}
class BZ extends AZ{

    static void m1(){
        System.out.println("BZ");
    }
}

public class StaticOverriding {

    public static void main(String[] args) {
        AZ b = new BZ();
        b.m1();

    }
}
