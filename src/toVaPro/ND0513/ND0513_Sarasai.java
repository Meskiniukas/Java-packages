package toVaPro.ND0513;

/**
 *
 * @author tomas
 */
public class ND0513_Sarasai {

    public static void main(String[] args) {
        
        MyLinkedList ml = new MyLinkedList();
        System.out.println(ml.toString());
        // {}
        System.out.println(ml.size());
        // 0
        
        ml.add("pirmas");
        System.out.println(ml.toString());
        // {pirmas}
        System.out.println(ml.size());
        // 1

        ml.add("antras");
        System.out.println(ml.toString());
        // {pirmas, antras}
        System.out.println(ml.size());
        // 2

        ml.add("trecias");
        System.out.println(ml.toString());
        // {pirmas, antras, trecias}
        System.out.println(ml.size());
        // 3
        
        System.out.println(ml.get(0));
        // pirmas
        System.out.println(ml.get(2));
        // trecias
        System.out.println(ml.get(-3));
        // null
        System.out.println(ml.get(3));
        // null
        
        ml.set(1, "kitas antras");
        System.out.println(ml.toString());
        // {pirmas, kitas antras, trecias}
        System.out.println(ml.size());
        // 3
        System.out.println(ml.get(1));
        System.out.println("******** ******** ******** ********");
        // kitas antras
        
        ml.remove(1);
        System.out.println(ml.toString());
        // {pirmas, trecias}
        System.out.println(ml.size());
        // 2
        System.out.println(ml.get(1));
        System.out.println("******** ******** ******** ********");
        // trecias
        
        ml.insert(0, "nulis");
        System.out.println(ml.toString());
        // {nulis, pirmas, trecias}
        System.out.println(ml.size());
        // 3
        System.out.println(ml.get(0));
        // nulis

        ml.insert(2, "pries trecia");
        System.out.println(ml.toString());
        // {nulis, pirmas, pries trecia, trecias}
        System.out.println(ml.size());
        // 4
        System.out.println(ml.get(2));
        // pries trecia
    }
    
}
/*
Sukurti klase
MyLinkedList

void add(Object o);

void remove(int index);

Object get(int index);

void set(int index, Object o);

int size();

String toString();

***
void insert(int index, Object o);


*/

