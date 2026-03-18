package ro.ase.cts.clase.RESTAURANT;

public abstract class Supa {
    protected String clasificare;
    protected int nrLegumeFolosite;

    public Supa(String clasificare, int nrLegumeFolosite) {
        this.clasificare = clasificare;
        this.nrLegumeFolosite = nrLegumeFolosite;
    }

    public abstract void afisareDescriere();
}
