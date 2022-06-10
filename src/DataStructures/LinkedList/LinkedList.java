package DataStructures.LinkedList;

public class LinkedList<T> {
    private Node<T> head;

    public LinkedList(T data) {
        this.head = new Node<T>(data);
    }

    /***
     * Checks if the linked list is empty.
     * @return true if it is empty false if not.
     */
    public boolean isEmpty() {
        return this.head == null;
    }

    /***
     * Checks the size of the linked list.
     * @return the size of the linked list.
     */
    public int size() {
        int counter = 0;
        Node<T> current = this.head;

        while (current != null) {
            counter++;
            current = current.getNextNode();
        }
        return counter;
    }

    /***
     * Inserts a node in the head of the linked list.
     * @param data to pass to the node.
     */
    public void insert(T data) {
        Node<T> newNode = new Node<T>(data);
        if (this.head != null) {
            newNode.setNextNode(this.head);
        }
        this.head = newNode;
    }

    /***
     * Inserts a node at a specified index in the linked list.
     * @param data to pass to the node.
     * @param index to insert the new node in the linked list.
     */
    public void insert(T data, int index) {
        Node<T> current = this.head;
        Node<T> previous = null;
        int counter = 0;
        Node<T> newNode = new Node<T>(data);

        if(this.size() < index)
            return;

        while(current != null){

            if(index == 0 && this.head != null){
                newNode.setNextNode(this.head);
                this.head = newNode;
                break;
            } else if(index == 0) {
                this.head = newNode;
                break;
            } else if(counter == index) {
                newNode.setNextNode(current);
                previous.setNextNode(newNode);
                break;
            }

            counter++;
            previous = current;
            current = current.getNextNode();
        }
    }

    /***
     * Adds an node to the end of the linked list.
     * @param data to pass to the node.
     */
    public void add(T data) {
        Node<T> newNode = new Node<T>(data);
        Node<T> current = this.head;
        while (current != null && current.getNextNode() != null) {
            current = current.getNextNode();
        }
        current.setNextNode(newNode);
    }

    @Override
    public String toString() {
        Node<T> current = this.head;
        String result = "";
        while (current != null) {
            result += current + " - ";
            current = current.getNextNode();
        }
        return result;
    }
}
