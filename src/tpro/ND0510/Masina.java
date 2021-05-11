package tpro.ND0510;

/**
 *
 * @author tomas
 */
public class Masina {

    protected String name;
    protected int maxspeed;
    protected int distance;
    protected int speed;

    public Masina(String name, int maxspeed) {
        this.name = name;
        this.maxspeed = maxspeed;
        this.speed = 0;
        this.distance = 0;
    }

    public String getName() {
        return name;
    }

    public int getDistance() {
        return distance;
    }

    public int getSpeed() {
        return speed;
    }

    public void gazuok(int kiek) {
        if (kiek < 0) {
            return;
        }
        this.speed = kiek + this.speed < this.maxspeed ? this.speed += kiek : this.maxspeed;
    }

    public void stabdyk(int kiek) {
        if (kiek < 0) {
            return;
        }
        this.speed = this.speed - kiek > 0 ? this.speed -= kiek : 0;
    }

    public void vaziuok() {
        this.distance += this.speed;
    }

}
