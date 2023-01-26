package DesignPatterns.Decorator;

public class Main {

    /**
     * GoF Definition:
     * 
     * Attach additional responsabilities to an object dynamically. Decorators provide a
     * flexible alternative to subclassing for extending functionality.
     * 
     * @param args
     */
    public static void main(String[] args) {
        
        ConcreteComponent withoutDecorator = new ConcreteComponent();
        withoutDecorator.makeHouse();

        FloorDecorator floorDecorator = new FloorDecorator();
        floorDecorator.setComponent(withoutDecorator);
        floorDecorator.makeHouse();

        PaintDecorator paintDecorator = new PaintDecorator();
        paintDecorator.setComponent(floorDecorator);
        paintDecorator.makeHouse();

    }
}
