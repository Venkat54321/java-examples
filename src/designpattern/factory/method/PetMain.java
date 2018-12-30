package designpattern.factory.method;

public class PetMain {

    public static void main(String[] args) {
        PetFactory factory = new PetFactory();

        Pet pet = factory.getPet("dog");
        pet.speak();
        Pet pet1 = factory.getPet("duck");
        pet1.speak();
    }
}
