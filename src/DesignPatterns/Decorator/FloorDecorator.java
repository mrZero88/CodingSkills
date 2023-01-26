package DesignPatterns.Decorator;

class FloorDecorator extends AbstractDecorator {

    @Override
    public void makeHouse() {
        super.makeHouse();
        // Decorating now
        System.out.println("***Floor decorator is in action***");
        this.addFloor();
    }

    private void addFloor() {
        System.out.println("I am making an additional floor on top of it.");
    }

}
