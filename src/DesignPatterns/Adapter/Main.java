package DesignPatterns.Adapter;

public class Main {

    /**
     * GoF Definition:
     * 
     * Convert the interface of a class into another interface that clients expect. Adapter lets
     * classes work together that could not otherwise because of incompatible interfaces.
     * 
     * @param args
     */
    public static void main(String[] args) {
        CalculatorAdapter calculatorAdapter = new CalculatorAdapter();
        Triangle triangle = new Triangle(20, 10);
        System.out.println(calculatorAdapter.getArea(triangle));
    }
}
