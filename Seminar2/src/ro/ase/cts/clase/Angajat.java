package ro.ase.cts.clase;

import java.util.Arrays;

public class Angajat extends Aplicant {
    private String ocupatie;
    private int salariu;
    private static int VALOARE_ANGAJAT = 10;


    public void setOcupatie(String ocupatie) {
        this.ocupatie = ocupatie;
    }

    public void setSalariu(int salariu) {
        this.salariu = salariu;
    }

    public Angajat() {
        super();

    }

    public static void setValoareAngajat(int valoareAngajat) {
        VALOARE_ANGAJAT = valoareAngajat;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Angajat{");
        sb.append(super.toString());
        sb.append("ocupatie='").append(ocupatie).append('\'');
        sb.append(", salariu=").append(salariu);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void afisareFinantare() {
        System.out.println("Angajatul " + getNume() + " " + getPrenume() + " primeste" + Angajat.VALOARE_ANGAJAT + " Euro/zi in proiect.");

    }

}
