package designpattern.startegy;

public class TestMain {

    public static void main(String[] args) {
        Context add = new Context(new AddOperation());
        Context sub = new Context(new SubOperation());

        System.out.println(add.execute(10,20));
        System.out.println(sub.execute(20,10));
    }
}
