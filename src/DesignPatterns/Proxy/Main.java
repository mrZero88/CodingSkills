package DesignPatterns.Proxy;

public class Main {

    /**
     * GoF Definition:
     * 
     * Provide a surrogate or placeholder for another object to control access to it.
     * 
     * @param args
     */
    public static void main(String[] args) {
        Proxy px = new Proxy();
        px.doSomeWork();

        ModifiedProxy px1 = new ModifiedProxy("Admi1n");
        px1.doSomeWork();
    }
}
