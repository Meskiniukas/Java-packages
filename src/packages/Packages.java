/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packages;

//import kitas.dar.Du;
//import kitas.dar.Vienas;
import kitas.dar.*;
import kitas.dar.Trys;

//  public - matomas iš visur;
//  protected - matomas deklaravusios klasės viduje, klasėms esančioms tame pačiame package ir paveldėjusioms klasėms;
//  (default) arba (package protected) - matomas tik deklaravusios klasės viduje ir klasėms esančioms tame pačiame package;
//  private - matomas tik deklaravusios klasės viduje;
//

/**
 *
 * @author tomas
 */
public class Packages {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Du du = new Du();
        Vienas kitasDarVienas = new Vienas();
        kitas.Vienas kitasVienas = new kitas.Vienas(); //Galima naudoti pilną klasės pavadinimą (su folderiais -- package+klasės pavadinimas[FQCN]), tada nereik importo.
//        FQCN = Fully qualified class name
        Trys trys = new Trys();
        System.out.println(du);
        System.out.println(kitasDarVienas);
        System.out.println(kitasVienas);
        System.out.println(trys); //naudoja pirmiausia iš savo package; nebent būtų tiesioginis importas be žvaigždutės.
        
        packages.Trys t3 = new packages.Trys();
        System.out.println(t3);
    
    }
}
