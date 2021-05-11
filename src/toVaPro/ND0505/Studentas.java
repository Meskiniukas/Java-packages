package toVaPro.ND0505;

/**
 *
 * @author tomas
 */
public class Studentas extends Zmogus {

    private String kursas;

    public Studentas(String vardas, String pavarde, String kursas) {
        super(vardas, pavarde);
        this.kursas = kursas;
    }
    
    public String getKursas() {
        return kursas;
    }

    public void setKursas(String kursas) {
        this.kursas = kursas;
    }
    
    public void studijuoju() {
        System.out.println("Mano studijų programa - " + this.kursas + ".");
    }
    
    @Override
    public void labas() {
        System.out.println("\nLabas, aš esu " + this.getClass().getSimpleName() + " " + this.getVardas() + " " + this.getPavarde() + ".");
    }
            
}
