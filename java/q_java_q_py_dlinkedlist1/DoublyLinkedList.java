public class DoublyLinkedList {
    Node startNode;

    public DoublyLinkedList() {
        this.startNode = null;
    }

    public String toString() {
        Node current = this.startNode;
        StringBuilder s = new StringBuilder("[");
        int i = 0;
        while (current != null) {
            if (i != 0) {
                s.append(", ").append(current.item);
            } else {
                s.append(current.item);
            }
            current = current.next;
            i++;
        }
        s.append("]");
        return s.toString();
    }

    public void insertAtStart(String data) {
        if (this.startNode == null) {
            this.startNode = new Node(data);
            return;
        }
        Node newNode = new Node(data);
        newNode.next = this.startNode;
        this.startNode.prev = newNode;
        this.startNode = newNode;
    }

    public void deleteAtStart() {
        if (this.startNode == null) {
            System.out.println("The list has no element to delete");
            return;
        }
        if (this.startNode.next == null) {
            this.startNode = null;
            return;
        }
        this.startNode = this.startNode.next;
        this.startNode.prev = null;
    }

    public void mysteryMethod() {
        if (this.startNode == null) {
            System.out.println("The list has no element to delete");
            return;
        }
        Node p = this.startNode;
        Node q = p.next;
        p.next = null;
        p.prev = q;

        while (q != null) {
            q.prev = q.next;
            q.next = p;
            p = q;
            q = q.prev;
        }
        this.startNode = p;
    }
}