package DesignPatterns.Factory.AbstractFactory;

class PetTiger implements Tiger {

    @Override
    public void speak() {
        System.out.println("Pet Tiger says softly: Halum.");
    }

    @Override
    public void preferredAction() {
        System.out.println("Pet Tigers play in the animal circus.\n");
    }
    
}
