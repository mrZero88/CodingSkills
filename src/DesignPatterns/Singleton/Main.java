package DesignPatterns.Singleton;

public class Main {

    /**
     * GoF Definition:
     * 
     * Ensure a class only has one instance,
     * and provide a global point of access to it.
     * 
     * @param args
     */
    public static void main(String[] args) {

        System.out.println("*** Singleton Patttern Demo");

        System.out.println("Trying to make a captain for your team:");
        // Constructor is private.We cannot use "new"

        // here. //Captain c3 = new Captain();//error
        // Captain captain1 = Captain.getCaptain();
        // System.out.println("Trying to make another
        // captain for your team:"); Captain captain2 =
        // Captain.getCaptain(); if (captain1 ==
        // captain2) { System.out.println("captain1 and
        // captain2 are same instance."); }

        // Produces error
        // Captain c3 = new Captain();

        Captain captain1 = Captain.getCaptain();

        Captain captain2 = Captain.getCaptain();

        if (captain1 == captain2) {
            System.out.println("Captain 1 and captain 2 are the same instance.");
        }

    }
}
