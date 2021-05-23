package toVaPro.ND0520;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author tomas
 */
public class ND0520_Maps {

    public static void main(String[] args) {

        String[] zodziai = {"labas", "pasauli", "kaip", "tau", "sekasi", "pasauli", "labas", "dar", "karta", "viso", "gero", "pasauli"};
        for (int i = 0; i < zodziai.length; i++) {
            if (i != zodziai.length - 1) {
                System.out.print(zodziai[i] + ", ");
            } else {
                System.out.print(zodziai[i] + ".\n\n");
            }
        }

        Map m1 = new HashMap();
        Map m2 = new HashMap();

        for (String s1 : zodziai) {
            int count = 0;
            for (String s2 : zodziai) {
                count = s1.equals(s2) ? count + 1 : count;
            }
            m1.put(s1, count);
        }

        for (String s1 : zodziai) {
            ArrayList sameLenght = new ArrayList();
            int length = s1.length();
            for (String s2 : zodziai) {
                if (length == s2.length()) {
                    sameLenght.add(s2);
                }
            }
            m2.put(length, sameLenght);
        }

        System.out.println(m1 + "\n");
        System.out.println(m2 + "\n");
    }
}

//"labas",  "pasauli", "kaip", "sekasi", "pasauli", "labas", "dar", "karta", "viso", "gero", "pasauli"

//1. sukurti Map'a is skirtingu zodziu ir ju pasikartojimo kiekio
//[labas: 2, pasauli:2, kaip: 1, sekasi:1, dar:1, karta:1, viso:1, gero:1]

//2. sukurti Map'a is ilgis ir zodziu sarasas
//[3:[dar], 4: [kaip, viso, gero], 5:[labas, labas, karta], 6: [sekasi], 7: [pasauli,pasauli]]
