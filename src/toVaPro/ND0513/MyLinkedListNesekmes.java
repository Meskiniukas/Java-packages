package toVaPro.ND0513;

/**
 *
 * @author tomas
 */
public class MyLinkedListNesekmes {

    private Node head;

    public MyLinkedListNesekmes() {
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

        if (index == 0) {
            this.head = this.head.next;
        } else {
            int i = 1;
            Node current = this.head.next;
            while (current != null) {
                if (i == index) {
//                    current.value = i < this.size() - 1 ? current.next.value : current.value;

                    for (int j = i; j < this.size(); j++) {
                        if (current.next != null) {
                            current.value = current.next.value;
                            current = current.next;
                        } else {
                            System.out.println("i = " + i + "; current.value = " + current.value);
                            current.value = null;
                            current = null;
                            System.out.println("i = " + i + "; current = " + current);
                        }
                    }
                    continue;
                }
                current = current.next;
                
//                if (this.head.next != null) {
//                    this.head = this.head.next;
//                }
                i++;
            }
        }
    }
    //    --> PARTIALLY DONE

    public Object get(int index) {

        int i = 0;
        Node current = this.head;
        while (current != null) {
            if (i == index) {
                return current.value;
            }
            current = current.next;
            i++;
        }
        return null;
    }
//    --> PARTIALLY DONE

    public void set(int index, Object o) {

        int i = 0;
        Node current = this.head;
        while (current != null) {
            if (i == index) {
                current.value = o;
            }
            current = current.next;
            i++;
        }
    }
//    --> PARTIALLY DONE

    public void insert(int index, Object o) {
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

    @Override
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

        Node(Object value) {
            this.next = null;
            this.value = value;
        }

        Node(Node next, Object value) {
            this.next = next;
            this.value = value;
        }
    }
}


/*
susikrti unchecked klaidos klase

ir metoduose remove, insert, get throw'inti klaida

 */
