package toVaPro.ND0513;

/**
 *
 * @author tomas
 */
public class AliausMyLinkedList {

        
    private Node head;
    
    public AliausMyLinkedList() {
        this.head = null;
    }

    public void add(Object o) {
        if (this.head == null) {
            this.head = new Node(o);
        } else {
            Node parent = this.head;
            while (parent.next != null) {
                parent = parent.next;
            }
            parent.next = new Node(o);
        }
    }

    public void remove(int index) {
        if (index < 0) {
            throw new IndexOutOfBoundsException("Negative index is not allowed");
        }
        if (index == 0) {
            if (this.head == null) {
                throw new IndexOutOfBoundsException();
            }
            this.head = this.head.next;
        } else {
            Node previous = this.head;
            int i = 0;
            while (i < index - 1 && previous.next != null) {
                previous = previous.next;
                i++;
            }
            if (previous.next == null) {
                throw new IndexOutOfBoundsException();
            }
            previous.next = previous.next.next;
        }
    }

    public Object get(int index) {
        if (index < 0) {
            throw new IndexOutOfBoundsException("Negative index is not allowed");
        }
        Node current = this.head;
        int i = 0;
        while (i < index && current != null) {
            current = current.next;
            i++;
        }
        if (current == null) {
            throw new IndexOutOfBoundsException();
        }
        return current.value;
    }

    public void set(int index, Object o) {
        if (index < 0) {
            throw new IndexOutOfBoundsException("Negative index is not allowed");
        }
        Node current = this.head;
        int i = 0;
        while (i < index && current != null) {
            current = current.next;
            i++;
        }
        if (current == null) {
            throw new IndexOutOfBoundsException();
        }
        current.value = o;
    }

    public void insert(int index, Object o) {
        if (index < 0) {
            throw new IndexOutOfBoundsException("Negative index is not allowed");
        }
        if (index == 0) {
            this.head = new Node(this.head, o);
        } else {
            Node previous = this.head;
            int i = 0;
            while (i < index - 1 && previous.next != null) {
                previous = previous.next;
                i++;
            }
            if (previous.next == null) {
                throw new IndexOutOfBoundsException();
            }
            previous.next = new Node(previous.next, o);
        }
    }

    public int size() {
        int size = 0;
        Node n = this.head;
        while (n != null) {
            size++;
            n = n.next;
        }
        return size;
    }

    public String toString() {
        String ret = "{";
        Node n = this.head;
        while (n != null) {
            ret += n.value + ", ";
            n = n.next;
        }
        ret += "}";
        return ret;
    }

    private class Node {
        Node next;
        Object value;
        Node (Object value) {
            this.next = null;
            this.value = value;
        }
        Node (Node next, Object value) {
            this.next = next;
            this.value = value;
        }
    }
    
}
