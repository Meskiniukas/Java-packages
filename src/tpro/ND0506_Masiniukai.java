package tpro;

/**
 *
 * @author tomas
 */
public class ND0506_Masiniukai {

    public static void main(String[] args) {

        Masina[] masiniukai = {
            new Masina("Porsche", 270),
            new Masina("BMW", 250),
            new Masina("Mercedes", 250),
            new SportineMasina("Mercedes-AMG", 300),
            new Masina("Zaporozec", 80),
            new Masina("VAZ-2107", 150),
            new Masina("GAZ-24", 140),
            new SportineMasina("AudiRS-6", 300)
        };
        
        int racelength = 10000;
        int tmpfinish = racelength / 10;
        int tmpfinishbreak = tmpfinish;
        int championdistance = 0;
        int champion = -1;
        int kiek;

        while (tmpfinish <= racelength) {
            for (int i = 0; i < masiniukai.length; i++) {
                if (masiniukai[i] instanceof SportineMasina) {
                    if (Math.random() < 0.5) {
                        ((SportineMasina) masiniukai[i]).setSpoiler(true);
//                        System.out.println(((SportineMasina) masiniukai[i]).isSpoiler()); //Testing
                    } else {
                        ((SportineMasina) masiniukai[i]).setSpoiler(false);
//                        System.out.println(((SportineMasina) masiniukai[i]).isSpoiler()); //Testing
                    }
                }
                if (Math.random() < 0.8) {
                    kiek = (int) (Math.random() * 10 + 1);
                    masiniukai[i].gazuok(kiek);
                } else {
                    kiek = (int) (Math.random() * 5 + 1);
                    masiniukai[i].stabdyk(kiek);
                }
                masiniukai[i].vaziuok();
//                System.out.println("Mašiniukas  " + masiniukai[i].getName() + "; Atstumas: " + masiniukai[i].getDistance() + "; Greitis: " + masiniukai[i].getSpeed()); //Testing
                if (masiniukai[i].getDistance() > championdistance) {
                    championdistance = masiniukai[i].getDistance();
                    champion = i;
                }
            }
            if (championdistance >= tmpfinish) {
                if (championdistance >= racelength) {
                    System.out.println("Pasibaigus lenktynėms, po " + racelength + " km LAIMĖJO mašiniukas " + masiniukai[champion].getName() + " 🥇!!! Nuvažiuotas atstumas: " + masiniukai[champion].getDistance() + " km; Greitis: " + masiniukai[champion].getSpeed() + " km/h.\n");

                    for (int ii = 0; ii < masiniukai.length - 1; ii++) {
                        for (int i = ii + 1; i < masiniukai.length; i++) {
                            if (masiniukai[ii].getDistance() < masiniukai[i].getDistance()) {
                                Masina tmp = masiniukai[i];
                                masiniukai[i] = masiniukai[ii];
                                masiniukai[ii] = tmp;
                            }
                        }
                    }
                    System.out.println("Turnyrinė lentelė:");
                    for (int i = 0; i < masiniukai.length; i++) {
                        System.out.println((i + 1) + ". " + masiniukai[i].getName() + " " + masiniukai[i].getDistance() + " km.");
                    }
                    System.out.println("\n");
                    break;
                } else {
                    tmpfinish = masiniukai[champion].getDistance() >= tmpfinish + tmpfinishbreak ? tmpfinish += tmpfinishbreak : tmpfinish;
                    System.out.println("Po " + tmpfinish + " km pirmauja mašiniukas " + masiniukai[champion].getName() + "; Nuvažiuotas atstumas: " + masiniukai[champion].getDistance() + " km; Greitis: " + masiniukai[champion].getSpeed() + " km/h.");
                    tmpfinish += tmpfinishbreak;
                }
            }
        }
    }
}
