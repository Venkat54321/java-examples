package designpattern.factory.method;

public class Duck implements Pet {

    @Override
    public void speak() {
        System.out.println("quack quack quack....");
    }
}
