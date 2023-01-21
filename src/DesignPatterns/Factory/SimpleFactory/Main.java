package DesignPatterns.Factory.SimpleFactory;

public class Main {
    public static void main(String[] args) {

        SimpleFactory simpleFactory = new SimpleFactory();
        
        Animal dog = simpleFactory.createAnimal("Dog");
        dog.speak();
        dog.preferredAction();

        Animal tiger = simpleFactory.createAnimal("Tiger");
        tiger.speak();
        tiger.preferredAction();

    }
}