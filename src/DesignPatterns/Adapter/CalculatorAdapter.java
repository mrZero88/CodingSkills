package DesignPatterns.Adapter;

class CalculatorAdapter {
    
    public double getArea(Triangle triangle) {
        Calculator calculator = new Calculator();
        Rectangle rectangle = new Rectangle();
        rectangle.length = triangle.base;
        rectangle.width = 0.5 * triangle.height;
        return calculator.getArea(rectangle);
    }
}
