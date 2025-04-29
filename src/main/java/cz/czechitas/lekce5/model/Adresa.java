package cz.czechitas.lekce5.model;

import java.util.Objects;
import java.util.regex.Pattern;

public class Adresa {
    /**
     * Regulární výraz testující, zda je vstup platné PSČ, tj. obsahuje právě pět číslic.
     *
     * <p>{@code \\d} označuje číslici (znaky 0–9).</p>
     *
     * <p>{@code {5}} označuje přesný opakování – 5.</p>
     */
    public static final Pattern RE_PSC = Pattern.compile("\\d{5}");
    private String ulice;
    private String castObce;
    private String obec;
    private String psc;

    /**
     * Vrací název ulice (pokud existuje) a domovní čísla.
     */
    public String getUlice() {
        return ulice;
    }

    public void setUlice(String ulice) {
        Objects.requireNonNull(ulice);
        if (ulice.isBlank()) {
            System.err.println("Řádek ulice a čísla domů nemůže být prázdný.");
            return;
        }
        this.ulice = ulice;
    }

    public String getCastObce() {
        return castObce;
    }

    public void setCastObce(String castObce) {
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
            System.err.println("PSČ nemůže být prázdné.");
            return;
        }
        if (psc.length() != 5) {
            System.err.print(psc);
            System.err.println(" – PSČ musí mít 5 znaků.");
            return;
        }
        if (!RE_PSC.matcher(psc).matches()) {
            System.err.print(psc);
            System.err.println(" – PSČ musí obsahovat jen číslice.");
            return;
        }
        this.psc = psc;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(ulice);
        builder.append(", ");
        if (castObce != null) {
            builder.append(castObce);
            builder.append(", ");
        }
        builder.append(psc);
        builder.append(" ");
        builder.append(obec);
        return builder.toString();
    }
}
