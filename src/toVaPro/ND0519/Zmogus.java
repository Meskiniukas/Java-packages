package toVaPro.ND0519;

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

    public String getPavarde() {
        return pavarde;
    }

    @Override
    public String toString() {
        return vardas + " " + pavarde;
    }

}
