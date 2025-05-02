package cz.czechitas.lekce5.model;

import java.util.Objects;

public class Adresa {

    private String ulice;
    private String castObce;
    private String obec;
    private String psc;



    public String getUlice() {
        return ulice;
    }

    public void setUlice(String ulice) {
        Objects.requireNonNull(ulice);
        if (ulice.isBlank()) {
            System.err.println("Ulice nemůže být prázdná.");
            return;
        }
        this.ulice = ulice;
    }

    public String getCastObce() {
        return castObce;
    }

    public void setCastObce(String castObce) {
        Objects.requireNonNull(castObce);
        if (castObce.isBlank()) {
            System.err.println("Část obce nemůže být prázdná.");
            return;
        }
        this.castObce = castObce;
    }

    public String getObec() {
        return obec;
    }

    public void setObec(String obec) {
        Objects.requireNonNull(obec);
        if (obec.isBlank()) {
            System.err.println("Obec nemůže být prázdná.");
            return;
        }
        this.obec = obec;
    }

    public String getPsc() {
        return psc;
    }

    public void setPsc(String psc) {

        }
        this.psc = psc;
    }


}
