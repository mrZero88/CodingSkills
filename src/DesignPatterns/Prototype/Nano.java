package DesignPatterns.Prototype;

public class Nano extends BasicCar {

    public Nano(String modelName) {
        this.basePrice = 100000;
        this.modelName = modelName;
    }

    @Override
    public BasicCar clone() throws CloneNotSupportedException {
        return (Nano)super.clone();
    }
}
