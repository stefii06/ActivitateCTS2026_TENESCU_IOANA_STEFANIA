package ro.acs.cts.Avion.avion1;

public class BuilderBilet implements AbstractBilet{
    private  Bilet bilet;

    public BuilderBilet(String nume_pasager, String destinatie) {
        bilet = new Bilet(nume_pasager,destinatie,false,false,false);
    }



    @Override
    public Bilet build() {
        return this.bilet;
    }

    @Override
    public AbstractBilet set_Nume(String nume) {
        this.bilet.setNume_pasager(nume);
        return this;
    }

    @Override
    public AbstractBilet set_Destinatie(String destinatie) {
        this.bilet.setDestinatie(destinatie);
        return this;
    }

    @Override
    public AbstractBilet set_LocGeam(boolean locGeam) {
        this.bilet.setLocGeam(locGeam);
        return this;
    }

    @Override
    public AbstractBilet set_bagajCala(boolean bagajCala) {
        this.bilet.setBagajCala(bagajCala);
        return this;
    }

    @Override
    public AbstractBilet set_prioritateImbarcare(boolean prioritateImbarcare) {
     this.bilet.setPrioritateImbarcare(prioritateImbarcare);
        return this;
    }
}
