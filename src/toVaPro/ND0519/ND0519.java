package toVaPro.ND0519;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author tomas
 */
public class ND0519 {

    public static void printElements(List l) {
        for (int i = 0; i < l.size(); i++) {
            System.out.println(i + 1 + ". " + l.get(i));
        }
        System.out.println("******** ******** ******** ********\n");
    }

    public static void printElementsPVilg(List l) {
        for (int i = 0; i < l.size(); i++) {
            System.out.println(i + 1 + ". " + l.get(i) + "(" + (l.get(i).toString().length() - 1) + ")");
        }
        System.out.println("******** ******** ******** ********\n");
    }

    public static void main(String[] args) {

        List<Zmogus> l = new LinkedList();

        l.add(new Zmogus("Jonas", "Jonaitis"));
        l.add(new Zmogus("Petras", "Petraitis"));
        l.add(new Zmogus("Antanas", "Antanaitis"));
        l.add(new Zmogus("Jonas", "Petraitis"));
        l.add(new Zmogus("Jonas", "Antanaitis"));
        l.add(new Zmogus("Antanas", "Petraitis"));
        l.add(new Zmogus("Petras", "Jonaitis"));
        l.add(new Zmogus("Faina", "Zeikelis"));
        l.add(new Zmogus("Chaimas", "Zeikelis"));
        l.add(new Zmogus("Kriuksa", "Zeikelis"));

        class LygintuvasV implements Comparator<Zmogus> {

            @Override
            public int compare(Zmogus z1, Zmogus z2) {
                return z1.getVardas().compareTo(z2.getVardas());
            }
        }

//        class LygintuvasPZA implements Comparator<Zmogus> {
//
//            @Override
//            public int compare(Zmogus z1, Zmogus z2) {
//                return z2.getPavarde().compareTo(z1.getPavarde());
//            }
//        }
        
        Comparator<Zmogus> c2 = new Comparator<Zmogus>() {
            @Override
            public int compare(Zmogus z1, Zmogus z2) {
                return z2.getPavarde().compareTo(z1.getPavarde());
            }
        };
  
        class LygintuvasVPAZ implements Comparator<Zmogus> {

            @Override
            public int compare(Zmogus z1, Zmogus z2) {
                int cv = z1.getVardas().compareTo(z2.getVardas());
                if (cv == 0) {
                    return z1.getPavarde().compareTo(z2.getPavarde());
                }
                return cv;
            }
        }

//        class LygintuvasPVZA implements Comparator<Zmogus> {
//
//            @Override
//            public int compare(Zmogus z1, Zmogus z2) {
//                int cp = z2.getPavarde().compareTo(z1.getPavarde());
//                if (cp == 0) {
//                    return z2.getVardas().compareTo(z1.getVardas());
//                }
//                return cp;
//            }
//        }
        
        Comparator<Zmogus> c4 = new Comparator<Zmogus>() {
            @Override
            public int compare(Zmogus z1, Zmogus z2) {
                int cp = z2.getPavarde().compareTo(z1.getPavarde());
                if (cp == 0) {
                    return z2.getVardas().compareTo(z1.getVardas());
                }
                return cp;
            }
        };

//        class LygintuvasPVilgZA implements Comparator<Zmogus> {
//
//            @Override
//            public int compare(Zmogus z1, Zmogus z2) {
//                int ilgisZ1 = z1.getVardas().length() + z1.getPavarde().length();
//                int ilgisZ2 = z2.getVardas().length() + z2.getPavarde().length();
//                return ilgisZ2 - ilgisZ1;
//            }
//        }

        Comparator<Zmogus> c5 = new Comparator<Zmogus>() {
            @Override
            public int compare(Zmogus z1, Zmogus z2) {
                int ilgisZ1 = z1.getVardas().length() + z1.getPavarde().length();
                int ilgisZ2 = z2.getVardas().length() + z2.getPavarde().length();
                return ilgisZ2 - ilgisZ1;
            }
        };

        Comparator c1 = new LygintuvasV();
        l.sort(c1);

        System.out.println("Pagal vardą ASC:\n");
        printElements(l);

        l.sort(c2);

        System.out.println("Pagal pavardę DESC:\n");
        printElements(l);

        Comparator c3 = new LygintuvasVPAZ();
        l.sort(c3);

        System.out.println("Pagal vardą, pavardę ASC:\n");
        printElements(l);

        l.sort(c4);

        System.out.println("Pagal pavardę, vardą DESC:\n");
        printElements(l);

        l.sort(c5);

        System.out.println("Pagal vardo + pavardės ilgį DESC:\n");
        printElementsPVilg(l);

    }

}
