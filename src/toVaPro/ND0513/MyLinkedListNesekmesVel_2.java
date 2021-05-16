package toVaPro.ND0513;

/**
 *
 * @author tomas
 */
public class MyLinkedListNesekmesVel_2 {

    private Node head;

    public MyLinkedListNesekmesVel_2() {
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
            Node temp = this.head, prev = null;
            int i = 0;
            while (temp != null && i != index) {
                prev = temp;
                temp = temp.next;
                i++;
            }
            if (temp != null) {
                prev.next = temp.next;
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

        if (index == 0) {
            Node newNode = new Node(o);
            newNode.next = this.head;
            this.head = newNode;
        } else {
            int i = 0;
            Node newNode = new Node(o);
           
//            while (i != index) {
                
                System.out.println("newNode.value: " + newNode.value);


                Node prev = this.head;
                Node temp = this.head.next;
                
                System.out.println("prev.value: " + prev.value);
                System.out.println("prev.next.value: " + prev.next.value);
                
//                prev.next = temp.next;
//                temp.next = newNode;
                
                

                /* 4. Make next of new Node as next of prev_node */
                newNode.next = prev.next;

                /* 5. make next of prev_node as new_node */
                prev.next = newNode;
                
           
            i++;
//            }
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
//    --> PARTIALLY DONE

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
