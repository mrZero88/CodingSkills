package DesignPatterns.Builder;

public class Main {

    /*
     * Separate the construction of a complex object from its representation so that
     * the same construction processes
     * can create different representations.
     */
    public static void main(String[] args) {
        System.out.println("*** Builder Patttern Demo");

        Director director = new Director();

        Builder fordCar = new Car("Ford");
        Builder hondaMotorcycle = new Motorcycle("Honda");

        // Making car
        director.construct(fordCar);
        Product p1 = fordCar.getVehicle();
        p1.showProduct();

        // Making motorcycle
        director.construct(hondaMotorcycle);
        Product p2 = hondaMotorcycle.getVehicle();
        p2.showProduct();
    }
}
