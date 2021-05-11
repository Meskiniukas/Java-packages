package toVaPro.ND0506;

/**
 *
 * @author tomas
 */
public class SportineMasina extends Masina {

    private boolean spoiler;

    public SportineMasina(String name, int maxspeed) {
        super(name, maxspeed);
        this.spoiler = false;
    }

    public boolean isSpoiler() {
        return spoiler;
    }
        
    public void setSpoiler(boolean spoiler) {
        this.spoiler = spoiler;
    }

    @Override
    public void gazuok(int kiek) {
        if (!this.spoiler) {
            super.gazuok(kiek * 2);
        } else {
            super.gazuok(kiek);
        }
    }

    @Override
    public void stabdyk(int kiek) {
        if (this.spoiler) {
            super.stabdyk(kiek * 2);
        } else {
            super.stabdyk(kiek);
        }
    }

}
