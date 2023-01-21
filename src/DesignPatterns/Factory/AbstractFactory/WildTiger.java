package DesignPatterns.Factory.AbstractFactory;

class WildTiger implements Tiger {

    @Override
    public void speak() {
        System.out.println("Wild Tiger says loudly: Halum.");
    }

    @Override
    public void preferredAction() {
        System.out.println("Wild Tigers prefer hunting in jungles.\n");
    }
    
}
