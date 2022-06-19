package DesignPatterns.Builder;

import java.util.ArrayList;

public class Product {

    /*
     * You can use any data structure that you prefer.
     * I have used ArrayList<String> in this case.
     */
    private ArrayList<String> parts;

    public Product() {
        this.parts = new ArrayList<String>();
    }

    public void add(String part) {
        this.parts.add(part);
    }

    public void showProduct() {
        System.out.println("\nProduct completed as below:\n");

        for (String part : this.parts)
            System.out.println(part);
    }

}
