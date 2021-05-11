package toVaPro.ND0505;

/**
 *
 * @author tomas
 */
public class Zmogus {
    
    private String vardas;
    private String pavarde;

    public Zmogus(String vardas, String pavarde) {
        this.vardas = vardas;
        this.pavarde = pavarde;
    }

    public String getVardas() {
        return vardas;
    }

    public void setVardas(String vardas) {
        this.vardas = vardas;
    }

    public String getPavarde() {
        return pavarde;
    }

    public void setPavarde(String pavarde) {
        this.pavarde = pavarde;
    }
    
    public void labas() {
        System.out.println("\nLabas, aš esu " + this.vardas + " " + this.pavarde + ".");
    }
    
}
