package DesignPatterns.Factory.SimpleFactory;

public class Dog implements Animal {

    @Override
    public void speak() {
        System.out.println("Dog says Bow-Wow.");
    }

    @Override
    public void preferredAction() {
        System.out.println("Dog prefer barking...\n");
    }

}
