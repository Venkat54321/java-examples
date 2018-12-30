package designpattern.factory.method;

public class PetFactory {

    public Pet getPet(String petType){

        Pet pet = null;

        if("dog".equalsIgnoreCase(petType)){
            pet = new Dog();
        }else if("duck".equalsIgnoreCase(petType)){
            pet = new Duck();
        }

        return pet;
    }
}
