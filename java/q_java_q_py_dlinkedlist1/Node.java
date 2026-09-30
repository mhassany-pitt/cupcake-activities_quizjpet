public class Node {
    String item;
    Node next;
    Node prev;

    public Node(String data) {
        this.item = data;
        this.next = null;
        this.prev = null;
    }
}