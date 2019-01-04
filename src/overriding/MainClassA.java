package overriding;

class AB{

    public AB(int i){
        System.out.println(1);
    }
    public AB(){
        this(10);
        System.out.println(2);
    }

    void AB(){
        AB(10);
        System.out.println(3);
    }
    void AB(int i){
        System.out.println(4);
    }
}

public class MainClassA {

    public static void main(String[] args) {
        new AB().AB();
    }

}
