package cz.czechitas.lekce5.model;

import java.sql.SQLOutput;
import java.util.Objects;

public class Adresa {
    @Override
    public String toString() {
        return "Adresa: " + ulice + ' ' + castObce + ' ' + obec + ' ' + psc ;
    }

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
        Objects.requireNonNull(psc);
        if (psc.isBlank()) {
            System.err.println("Psč nemůže být prázdné.");
        } else if (psc.matches("\\d{5}")) {
            return;
        } else {
            System.err.println("V hodnotě psč jsou neplatné znaky.");
        }


        this.psc = psc;
    }



}
