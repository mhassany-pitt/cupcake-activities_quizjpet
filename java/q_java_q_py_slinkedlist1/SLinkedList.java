public class SLinkedList {
    private SLinkedListNode head;
    private int size;

    public SLinkedList() {
        head = null;
        size = 0;
    }

    public String toString() {
        String s = "[";
        int i = 0;
        SLinkedListNode current = head;
        while (current != null) {
            if (i > 0) {
                s += ",";
            }
            String dataObject = current.getData();
            if (dataObject != null) {
                s += dataObject;
                i++;
            }
            current = current.getNext();
        }
        s += "]";
        return s;
    }

    public void add(String item) {
        SLinkedListNode temp = new SLinkedListNode(item, null);
        temp.setNext(head);
        head = temp;
        size++;
    }

    public int index(String item) {
        SLinkedListNode current = head;
        boolean found = false;
        int index = 0;
        while (current != null && !found) {
            if (current.getData().equals(item)) {
                found = true;
            } else {
                current = current.getNext();
                index++;
            }
        }
        if (!found) {
            index = -1;
        }
        return index;
    }

    public void remove(String item) {
        SLinkedListNode current = head;
        SLinkedListNode previous = null;
        boolean found = false;
        while (!found) {
            if (current.getData().equals(item)) {
                found = true;
            } else {
                previous = current;
                current = current.getNext();
            }
        }
        if (previous == null) {
            head = current.getNext();
        } else {
            previous.setNext(current.getNext());
        }
        size--;
    }

    public void append(String item) {
        SLinkedListNode temp = new SLinkedListNode(item, null);
        if (head == null) {
            head = temp;
        } else {
            SLinkedListNode current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(temp);
        }
        size++;
    }

    public String pop() {
        SLinkedListNode current = head;
        SLinkedListNode previous = null;

        if (head == null) return null; // prevents popping an empty list

        while (current.getNext() != null) {
            previous = current;
            current = current.getNext();
        }

        if (previous == null) {
            head = null;
        } else {
            previous.setNext(null);
        }
        size--;
        return current.getData();
    }
}