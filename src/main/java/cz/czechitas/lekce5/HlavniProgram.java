package cz.czechitas.lekce5;

import cz.czechitas.lekce5.model.Adresa;
import cz.czechitas.lekce5.model.Osoba;

/**
 * Hlaví třída pro lekci 5.
 */
public class HlavniProgram {

    /**
     * Spouštěcí metoda celé aplikace.
     *
     * @param args
     */
    public static void main(String... args) {
        System.out.println("Slavnostně přísahám, že jsem připraven ke každé špatnosti.");

        Adresa adresa = new Adresa();
        adresa.setUlice("Václavské náměstí 837/11");
        adresa.setCastObce("Nové Město");
        adresa.setObec("Praha 1");
        adresa.setPsc("11000");
        System.out.println(adresa);

        adresa.setPsc("11"); //Vypíše chybu
        adresa.setPsc("A1000"); //Vypíše chybu

        Osoba czechita = new Osoba();
        czechita.setJmeno("Jana");
        czechita.setPrijmeni("Czechita");
        czechita.setRodneCislo("141111/3000");
        czechita.setPracovniEmail("info@czechitas.cz");
        czechita.setAdresa(adresa);
        System.out.println(czechita);
    }

}
