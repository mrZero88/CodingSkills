package DesignPatterns.Prototype;

public class Main {

    /**
     * GoF Definition:
     * 
     * Specify the kinds of objects to create using a prototypical instance, and
     * create new objects by copying this prototype.
     * 
     * @param args
     * @throws CloneNotSupportedException
     */
    public static void main(String[] args) throws CloneNotSupportedException {

        System.out.println("*** Prototype Patttern Demo");

        BasicCar nano = new Nano("Green Nano");
        nano.basePrice = 100000;

        BasicCar ford = new Ford("Ford Yellow");
        ford.basePrice = 500000;

        BasicCar bc1;

        // Nano

        bc1 = nano.clone();
        bc1.onRoadPrice = nano.basePrice = nano.basePrice + BasicCar.setAddiitionalPrice();

        System.out.println("Car is " + bc1.modelName + " and it's price is " + bc1.onRoadPrice);

        // Ford

        bc1 = ford.clone();
        bc1.onRoadPrice = ford.basePrice = ford.basePrice + BasicCar.setAddiitionalPrice();

        System.out.println("Car is " + bc1.modelName + " and it's price is " + bc1.onRoadPrice);
    }
}
