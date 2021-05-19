package toVaPro.ND0518;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author tomas
 */
public class ND0518 {

    public static void fill(List l, int count) {

        for (int i = 0; i < count; i++) {
            l.add((int) (Math.random() * 100 + 1));
        }
    }

    public static double average(List l) {

        int sum = 0;
        double average;
        for (int i = 0; i < l.size(); i++) {
            sum += (int) l.get(i);
        }
        average = (double) sum / l.size();
        System.out.println("Suma = " + sum + "; Dydis = " + l.size() + "; Vidurkis: " + average + ";");
        return average;
    }
    
    public static double max(List l) {
        
        int max = (int) l.get(0);
        for (int i = 1; i < l.size(); i++) {
            max = (int) l.get(i) > max ? (int) l.get(i) : max;
        }
        return max;
    }
    
    
    public static double min(List l) {
        
        int min = (int) l.get(0);
        for (int i = 1; i < l.size(); i++) {
            min = (int) l.get(i) < min ? (int) l.get(i) : min;
        }
        return min;
    }
    

    public static void main(String[] args) {

        System.out.println(new Date());
        List l = new ArrayList();
        int count = (int) (Math.random() * 100 + 1);
//        count = 100000000; // Count 100.000.000 Execute Time: 2 sec. (ArrayList); || count 100.000 Execute Time: 8 sec. (LinkedList).
        fill(l, count);
        for (int i = 0; i < l.size(); i++) {
            System.out.println(l.get(i));
        }
        average(l);
        System.out.println("MAX of list: " + max(l));
        System.out.println("MIN of list: " + min(l));
        System.out.println(new Date());
    }

}
