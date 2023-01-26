package DesignPatterns.Decorator;

class PaintDecorator extends AbstractDecorator {

    @Override
    public void makeHouse() {
        super.makeHouse();
        // Decorating now
        System.out.println("***Paint decorator is in action now***");
        this.paintTheHouse();
    }

    private void paintTheHouse() {
        System.out.println("Now I am painting the house.");
    }

}
