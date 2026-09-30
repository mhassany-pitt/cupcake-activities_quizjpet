public class SLinkedListNode {
    private String data;
    private SLinkedListNode next;

    public SLinkedListNode(String initData, SLinkedListNode initNext) {
        data = initData;
        next = initNext;
    }

    public String getData() {
        return data;
    }

    public SLinkedListNode getNext() {
        return next;
    }

    public void setData(String newData) {
        data = newData;
    }

    public void setNext(SLinkedListNode newNext) {
        next = newNext;
    }
}