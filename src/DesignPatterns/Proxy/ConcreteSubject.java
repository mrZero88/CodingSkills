package DesignPatterns.Proxy;

class ConcreteSubject extends Subject {

    @Override
    public void doSomeWork() {
        System.out.println("Do some work() inside ConcreteSubject is invoked.");        
    }
    
}
