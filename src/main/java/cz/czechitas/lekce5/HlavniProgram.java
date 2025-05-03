package cz.czechitas.lekce5;

import cz.czechitas.lekce5.model.Adresa;
import cz.czechitas.lekce5.model.Osoba;
import cz.czechitas.lekce5.model.Telefon;

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

        adresa.setUlice("Poštova 1200/1");
        adresa.setObec("Dolni Chabry");
        adresa.setCastObce("Praha 8");
        adresa.setPsc("18400");

        System.out.println(adresa.toString());


        Osoba novak = new Osoba();

        novak.setJmeno("Marketa");
        novak.setPrijmeni("Novak");
        novak.setRodneCislo("885521/2091");
        novak.setAdresa(adresa);
        novak.setPracovniEmail("veronika.vysinova@gmail.com");
        novak.setTelefon(new Telefon());

        System.out.println(novak);



    }
}