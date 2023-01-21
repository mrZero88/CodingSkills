package DesignPatterns.Factory.FactoryMethod;

public abstract class AnimalFactory {
    public abstract Animal createAnimal();

    public Animal makeAnimal() {
        Animal animal = createAnimal();
        animal.speak();
        animal.preferredAction();
        return animal;
    }
}
