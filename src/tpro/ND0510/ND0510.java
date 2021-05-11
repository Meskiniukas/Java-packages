package tpro.ND0510;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ND0510 {

    public static void main(String[] args) {

        Object oo = new Object();
        classInfo(oo.getClass());
        
        String ss = "";
        classInfo(ss.getClass());
        
        Masina mm = new Masina("Bentley", 280);
        classInfo(mm.getClass());
        
        SportineMasina spm = new SportineMasina("Mercedes-AMG", 300);
        classInfo(spm.getClass());

    }

    public static void classInfo(Class c) {

        System.out.println("\n\nClass name: " + c.getName());

        Field[] fields = c.getDeclaredFields();

        if (fields.length > 0) {
            System.out.println("\nDeclared fields:");
            for (int i = 0; i < fields.length; i++) {
                System.out.println(fields[i].getName());
            }
        }

        Method[] methods = c.getDeclaredMethods();

        if (methods.length > 0) {
            System.out.println("\nDeclared methods:");
            for (int i = 0; i < methods.length; i++) {
                System.out.println(methods[i].getName());
            }
        }

        Class superclass = c.getSuperclass();
        if (superclass != null) {
            classInfo(superclass);
        }

    }

}
