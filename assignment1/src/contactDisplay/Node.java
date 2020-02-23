package contactDisplay;

public class Node<E> {
    private E data;
    private Node next;

    public Node(E data) {
        this.data = data;
        next = null;
    }

    public Node(String f_name, String l_name, long phone, String email) {
    }

    public E getData() {
        return data;
    }

    public void setData(E data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
