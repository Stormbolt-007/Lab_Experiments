package experiment3;

public class SinglyLinkedList {
    private Node head;
    private Node tail;

    public Node getHead() {
        return head;
    }
    public void addLast(int digit){
        Node node = new Node(digit);
        if (isEmpty()) {
            head = node;
            tail = node;
        }
        else{
            tail.setNext(node);
            tail = node;
        }
    }

    private boolean isEmpty() {
        return head == null;
    }
}
