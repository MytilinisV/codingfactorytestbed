package gr.aueb.cf.ch19.dlist;

public class DoublyLinkedList<T> {
    private Node<T> head;
    private Node<T> tails;

    public DoublyLinkedList() {
        head = tails = null;
    }

    public void insertFront(T t) {
        Node<T> tmp = new Node<>();
        tmp.setValue(t);
        tmp.setNext(head);
        tmp.setPrev(null);

        head = tmp;
        if (tmp.getNext() == null) {
            tails = tmp;
        } else  {
            tmp.getNext().setPrev(tmp);
        }
    }

    public void deleteFront() {
        if (head.getNext() == null) {
            head = tails = null;
        } else {
            head = head.getNext();
            head.setPrev(null);
        }
    }

    public void deleteEnd() {
        if (tails.getNext() == null) {
            head = tails = null;
        } else {
            tails = tails.getNext();
            tails.setPrev(null);
        }
    }

    public Node<T> get(T t) {
        for (Node<T> p = head; p != null; p = p.getNext()) {
            if (p.getValue().equals(t)) {
                return p;
            }
        }
        return null;
    }

    public void traverse() {
        for (Node<T> p = head; p != null; p = p.getNext()) {
            System.out.println(p);
        }
    }

    public boolean isEmpty() {
        return (head == null) && (tails == null);
    }


    public int size() {
        int counter = 0;
        for (Node<T> p = head; p != null; p = p.getNext()) {
            counter++;
        }

        return counter;
    }
}
