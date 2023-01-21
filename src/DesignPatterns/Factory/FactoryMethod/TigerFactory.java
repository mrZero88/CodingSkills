package DesignPatterns.Factory.FactoryMethod;

public class TigerFactory extends AnimalFactory {

    @Override
    public Animal createAnimal() {
        // Creating a Tiger
        return new Tiger();
    }
    
}
