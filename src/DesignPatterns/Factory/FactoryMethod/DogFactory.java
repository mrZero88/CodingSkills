package DesignPatterns.Factory.FactoryMethod;

public class DogFactory extends AnimalFactory {

    @Override
    public Animal createAnimal() {
        // Creating a Tiger
        return new Dog();
    }
    
}
