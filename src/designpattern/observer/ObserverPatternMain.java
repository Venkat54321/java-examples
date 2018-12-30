package designpattern.observer;

public class ObserverPatternMain {

    public static void main(String[] args) {

        Person p1 = new Person("Venkat");
        Person p2 = new Person("Sonu");

        Product product1 = new Product("SAMSUNG","MOBILE","available");
        Product product2 = new Product("COOCKER","ELECTRONIC","not available");

        product1.registorObserver(p1);
        product1.registorObserver(p2);

        product2.registorObserver(p1);
        product2.registorObserver(p2);

        product1.notifyObserver();
        product2.notifyObserver();

    }
}
