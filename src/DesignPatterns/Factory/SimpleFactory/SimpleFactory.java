package DesignPatterns.Factory.SimpleFactory;

class SimpleFactory {

    public Animal createAnimal(String type) {

        switch (type) {
            case "Dog":
                return new Dog();
            case "Tiger":
                return new Tiger();
            default:
                throw new IllegalArgumentException();
        }
    }

}
