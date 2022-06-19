package DataStructures.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList<Integer> ll = new LinkedList<Integer>(10);
        System.out.println(ll.isEmpty());
        System.out.println(ll.size());
        ll.insert(20);
        ll.insert(30);
        System.out.println(ll.size());
        ll.add(40);
        ll.add(50);
        ll.insert(1);
        System.out.println(ll);
        System.out.println(ll.size());
        ll.insert(99, 6);
        System.out.println(ll);
    }
}
