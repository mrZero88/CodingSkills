package DesignPatterns.Proxy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ModifiedProxy extends Subject {

    static Subject cs;
    String currentUser;
    List<String> registeredUsers;

    public ModifiedProxy(String currentUser) {
        this.registeredUsers = new ArrayList<>(Arrays.asList("Admin", "Rohit", "Sam"));
        this.currentUser = currentUser;
    }

    @Override
    public void doSomeWork() {
        if (this.registeredUsers.contains(this.currentUser)) {
            if (cs == null) {
                cs = new ConcreteSubject();
            }
            cs.doSomeWork();
        } else {
            System.out.println("Sorry, the user " + this.currentUser + " does not have access rights.");
        }
    }

}
