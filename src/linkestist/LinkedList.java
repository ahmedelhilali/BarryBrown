package linkestist;

public class LinkedList {
    private Node head;

    public LinkedList() {
        head = null;
    }

    public void add(String name) {
        Node node = null;
        if (head == null) {
            head = new Node(name);
        } else  {
            while (head != null) {
                node = head.getNext();
            }
            node.setNext(new Node(name));
        }
    }
}
