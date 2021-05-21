package toVaPro.ND0520;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author tomas
 */
public class ND0520_BeforeEndTemplate {

    public static void main(String[] args) {
        
        
        String[] zodziai = {"labas", "pasauli", "kaip", "sekasi", "pasauli", "labas", "dar", "karta", "viso", "gero", "pasauli"};

        int[] repeatcount = new int[zodziai.length];
        for (int i = 0; i < repeatcount.length; i++) {
            repeatcount[i] = 1;
        }

        int[] stringLengthIndicator = new int[zodziai.length];

        String st;

        int[] help = new int[zodziai.length];

        Map m1 = new HashMap();
        Map m2 = new HashMap();

        for (int ii = 0; ii < zodziai.length - 1; ii++) {
            for (int i = ii + 1; i < zodziai.length; i++) {
                if (zodziai[ii].equals(zodziai[i])) {
                    repeatcount[i]++;
                    m1.put(zodziai[i], repeatcount[i]);
                } else {
                    m1.put(zodziai[ii], repeatcount[ii]);
                }
            }
        }

//        for (int i = 0; i < repeatcount.length; i++) {
//            System.out.print(repeatcount[i] + " ");
//        }
        System.out.println(m1 + "\n");

        for (int i = 0; i < zodziai.length; i++) {
            stringLengthIndicator[i] = zodziai[i].length();
        }

        for (int i = 0; i < stringLengthIndicator.length; i++) {
            System.out.print(zodziai[i] + ": " + stringLengthIndicator[i] + "; ");
        }

        System.out.println("\n\n");

        int reply = 0;
        for (int ii = 0; ii < zodziai.length - 1; ii++) {
            for (int j = 0; j < help.length; j++) {
                System.out.println("string length indicator [" + ii + "] = " + stringLengthIndicator[ii]);
                if (stringLengthIndicator[ii] == help[j]) {
                    reply = 1;
                }
            }
            if (reply != 1) {
                st = "";
                st += zodziai[ii];
                System.out.println(st);
                help[ii] = stringLengthIndicator[ii];
                System.out.println("string length indicator " + stringLengthIndicator[ii]);
                m2.put(stringLengthIndicator[ii], st);
                for (int i = ii + 1; i < zodziai.length; i++) {
                    if (stringLengthIndicator[ii] == stringLengthIndicator[i]) {
                        st += ", " + zodziai[i];
                        System.out.println(st);
                        help[ii] = stringLengthIndicator[ii];
                        m2.put(stringLengthIndicator[ii], st);
//                        System.out.println(m2 + "\n");
                    }
                }
            }
            reply = 0;
        }
        for (int i = 0; i < help.length; i++) {
            System.out.print(help[i] + " ");
            
        }
        System.out.println("\n" + m2);
    }

}

//"labas",  "pasauli", "kaip", "sekasi", "pasauli", "labas", "dar", "karta", "viso", "gero", "pasauli"

//1. sukurti Map'a is skirtingu zodziu ir ju pasikartojimo kiekio
//[labas: 2, pasauli:2, kaip: 1, sekasi:1, dar:1, karta:1, viso:1, gero:1]

//2. sukurti Map'a is ilgis ir zodziu sarasas
//[3:[dar], 4: [kaip, viso, gero], 5:[labas, labas, karta], 6: [sekasi], 7: [pasauli,pasauli]]

        