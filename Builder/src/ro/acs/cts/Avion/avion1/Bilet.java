package ro.acs.cts.Avion.avion1;

public class Bilet {
    private String nume_pasager;
    private String destinatie;
    private boolean locGeam;
    private boolean bagajCala;
    private boolean prioritateImbarcare;

    public Bilet(String nume_pasager, String destinatie, boolean locGeam, boolean bagajCala, boolean prioritateImbarcare) {
        this.nume_pasager = nume_pasager;
        this.destinatie = destinatie;
        this.locGeam = locGeam;
        this.bagajCala = bagajCala;
        this.prioritateImbarcare = prioritateImbarcare;
    }

    public Bilet() {
        this.nume_pasager = "nume_pasager";
        this.destinatie = "destinatie";
        this.locGeam = false;
        this.bagajCala = false;
        this.prioritateImbarcare = false;
    }

    public void setNume_pasager(String nume_pasager) {
        this.nume_pasager = nume_pasager;
    }

    public void setDestinatie(String destinatie) {
        this.destinatie = destinatie;
    }

    public void setLocGeam(boolean locGeam) {
        this.locGeam = locGeam;
    }

    public void setBagajCala(boolean bagajCala) {
        this.bagajCala = bagajCala;
    }

    public void setPrioritateImbarcare(boolean prioritateImbarcare) {
        this.prioritateImbarcare = prioritateImbarcare;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Bilet{");
        sb.append("nume_pasager='").append(nume_pasager).append('\'');
        sb.append(", destinatie='").append(destinatie).append('\'');
        sb.append(", locGeam=").append(locGeam);
        sb.append(", bagajCala=").append(bagajCala);
        sb.append(", prioritateImbarcare=").append(prioritateImbarcare);
        sb.append('}');
        return sb.toString();
    }


}
