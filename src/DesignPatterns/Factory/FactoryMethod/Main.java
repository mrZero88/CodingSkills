package DesignPatterns.Factory.FactoryMethod;

public class Main {

    /**
     * GoF Definition:
     * 
     * Define an interface for creating an object,
     * but let subclasses decide which class to instantiate.
     * Factory method lets a class defer instantiation to subclasses.
     * 
     * @param args
     */
    public static void main(String[] args) {

        // Creating a Tiger factory
        AnimalFactory tigerFactory = new TigerFactory();
        Animal aTiger = tigerFactory.createAnimal();
        aTiger.speak();
        aTiger.preferredAction();

        // Creating a Dog Factory
        AnimalFactory dogFactory = new DogFactory();
        Animal aDog = dogFactory.createAnimal();
        aDog.speak();
        aDog.preferredAction();
    }
}