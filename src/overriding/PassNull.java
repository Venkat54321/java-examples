package overriding;

public class PassNull {

    public void display(PassNull t){
        System.out.println("test");
    }
    public void display(String s){
        System.out.println("test1");
    }

    public static void main(String[] args) {
       // new PassNull().display(null);
    }
}
