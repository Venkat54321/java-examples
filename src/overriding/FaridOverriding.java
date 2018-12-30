package overriding;


class A{

    private void m1(long n) throws Exception {
        System.out.print("A class m1 method value ");
    }

}
class B extends A{

    public void m1(int n){
        System.out.print("B class m1 method value ");
    }
}
class C extends B{

    /*public void m1(){
        System.out.print("C class m1 method value ");
    }*/
}


public class FaridOverriding {

    public static void main(String[] args) {

        A objA =(B) new C();

    }
}
