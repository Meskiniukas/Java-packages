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

//        ml.add("ketvirtas");
//        System.out.println(ml.toString());
//        // {pirmas, antras, trecias, ketvirtas}
//        System.out.println(ml.size());
//        // 4
//        
//        ml.add("penktas");
//        System.out.println(ml.toString());
//        // {pirmas, antras, trecias, ketvirtas, penktas}
//        System.out.println(ml.size());
//        // 5
//        
//        ml.add("šeštas");
//        System.out.println(ml.toString());
//        // {pirmas, antras, trecias, ketvirtas, penktas, šeštas}
//        System.out.println(ml.size());
//        // 6
//        
//        ml.add("septintas");
//        System.out.println(ml.toString());
//        // {pirmas, antras, trecias, ketvirtas, penktas, šeštas, septintas}
//        System.out.println(ml.size());
//        // 7
//        
//        ml.add("aštuntas");
//        System.out.println(ml.toString());
//        // {pirmas, antras, trecias, ketvirtas, penktas, šeštas, septintas, aštuntas}
//        System.out.println(ml.size());
//        // 8
        int getIndex = 0;
        try {
            System.out.println(ml.get(getIndex));
            // pirmas
        } catch (NecheckedKlaida kl) {
            System.out.println("KLAIDA !  " + kl);
        }

        getIndex = 2;
        try {
            System.out.println(ml.get(getIndex));
            // trečias
        } catch (NecheckedKlaida kl) {
            System.out.println("KLAIDA !  " + kl);
        }

        getIndex = -3;
        try {
            System.out.println(ml.get(getIndex));
            // null
        } catch (NecheckedKlaida kl) {
            System.out.println("KLAIDA !  " + kl);
        }

        getIndex = 3;
        try {
            System.out.println(ml.get(getIndex));
            // null
        } catch (NecheckedKlaida kl) {
            System.out.println("KLAIDA !  " + kl);
        }

        int setIndex = 1;
        try {
            ml.set(setIndex, "kitas antras");
        } catch (NecheckedKlaida kl) {
            System.out.println("KLAIDA !  " + kl);
        }
        System.out.println(ml.toString());
        // {pirmas, kitas antras, trecias}
        System.out.println(ml.size());
        // 3
        System.out.println(ml.get(1));
        System.out.println("******** ******** ******** ********");
        // kitas antras

        int remIndex = 1;
        try {
            ml.remove(remIndex);
        } catch (NecheckedKlaida kl) {
            System.out.println("KLAIDA !  " + kl);
        }
        System.out.println(ml.toString());
        // {pirmas, trecias}
        System.out.println(ml.size());
        // 2
        System.out.println(ml.get(1));
        System.out.println("******** ******** ******** ********");
        // trecias

        int insIndex = 0;
        try {
            ml.insert(insIndex, "nulis");
        } catch (NecheckedKlaida kl) {
            System.out.println("KLAIDA !  " + kl);
        }
        System.out.println(ml.toString());
        // {nulis, pirmas, trecias}
        System.out.println(ml.size());
        // 3
        System.out.println(ml.get(0));
        // nulis

        insIndex = 2;
        try {
            ml.insert(insIndex, "pries trecia");
        } catch (NecheckedKlaida kl) {
            System.out.println("KLAIDA !  " + kl);
        }
        System.out.println(ml.toString());
        // {nulis, pirmas, pries trecia, trecias}
        System.out.println(ml.size());
        // 4
        getIndex = 2;
        try {
            System.out.println(ml.get(2));
        } catch (NecheckedKlaida kl) {
            System.out.println("KLAIDA !  " + kl);
        }
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
