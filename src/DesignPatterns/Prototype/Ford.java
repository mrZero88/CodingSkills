package DesignPatterns.Prototype;

public class Ford extends BasicCar {

    public Ford(String modelName) {
        this.basePrice = 500000;
        this.modelName = modelName;
    }

    @Override
    public BasicCar clone() throws CloneNotSupportedException {
        return (Ford) super.clone();
    }

}
