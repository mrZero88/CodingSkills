package DesignPatterns.Builder;

public class Motorcycle implements Builder {
    
    private String brandName;
    private Product product;

    public Motorcycle(String brandName) {
        this.product = new Product();
        this.brandName = brandName;
    }

    @Override
    public void startUpOperations() {
        // Nothing in this case
        
    }

    @Override
    public void buildBody() {
        product.add("This is a body of a Motorcycle");
        
    }

    @Override
    public void insertWheels() {
        product.add("2 wheels are added");
        
    }

    @Override
    public void addHeadlights() {
        product.add("1 headlights are added");
        
    }

    @Override
    public void endOperations() {
        // Finishing up with the brand name
        product.add(String.format("Motorcycle model is: %s", this.brandName));
        
    }

    @Override
    public Product getVehicle() {
        return this.product;
    }
}
