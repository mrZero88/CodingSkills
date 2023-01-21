package DesignPatterns.Factory.FactoryMethod;

public class Main {
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