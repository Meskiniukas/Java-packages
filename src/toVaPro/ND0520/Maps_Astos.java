package toVaPro.ND0520;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author tomas
 */
public class Maps_Astos {

    public static void main(String[] args) {
        Map m = new HashMap();
        Map m2 = new HashMap();

        String[] zodziai = {"labas", "pasauli", "kaip", "tau", "sekasi", "pasauli", "labas", "dar", "karta", "viso", "gero", "pasauli"};

        uzpildytiMap(m, zodziai);
        zodziuIlgis(m2, zodziai);

    }

    public static void uzpildytiMap(Map m, String[] s) {
        int count = 0;
        for (String string1 : s) {
            for (String string2 : s) {
                if (string1.equals(string2)) {
                    count++;
                }
            }
            m.put(string1, count);
            count = 0;
        }
        System.out.println(m);
    }

    public static void zodziuIlgis(Map m, String[] s) {
        ArrayList<String> sameLenght = new ArrayList<>();
        for (String string : s) {
            int length = string.length();
            for (String string1 : s) {
                int v = string1.length();
                if (v == length) {
                    sameLenght.add(string1);
                }
            }
            m.put(length, sameLenght);
            sameLenght = new ArrayList<>();
        }
        System.out.println(m);
    }
}
    
