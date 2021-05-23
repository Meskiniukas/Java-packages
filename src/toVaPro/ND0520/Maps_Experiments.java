package toVaPro.ND0520;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author tomas
 */
public class Maps_Experiments {

    public static void main(String[] args) {

//        String st;
//
//        Map m1 = new HashMap();
//        Map m2 = new HashMap();
//
//        m1.put(5, "labas, labas, labas");
//        System.out.println(m1);
//        m1.put(7, "pasauli, pasauli, pasauli");
//        System.out.println(m1);
//
//        System.out.println("******** ******** ******** ********\n");
//
//        st = "";
//        st += "labas";
//        st += ", labas";
//        st += ", labas";
//        m2.put(5, st);
//        System.out.println(m2);
//
//        st = "";
//        st += "pasauli";
//        st += ", pasauli";
//        st += ", pasauli";
//        m2.put(7, st);
//        System.out.println(m2);
//
//        System.out.println("******** ******** ******** ********\n");

        List list = new ArrayList();
        Map mex = new HashMap();

        list.add("labas1");
        list.add("labas2");
        list.add("labas3");
        
        mex.put(5, list);
        System.out.println(mex);

        list.clear();
        System.out.println("\n" + mex);
//        list = new ArrayList();

        list.add("pasauli1");
        list.add("pasauli2");
        list.add("pasauli3");
        mex.put(7, list);
        System.out.println("\n" + mex);
    }
}
