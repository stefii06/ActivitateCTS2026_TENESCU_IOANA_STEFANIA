package ro.acs.cts.Avion.avion2;

import ro.acs.cts.Avion.avion1.AbstractBilet;
import ro.acs.cts.Avion.avion1.Bilet;

public class BuilderBilet2 implements AbstractBilet2{

    private boolean locGeam;
    private boolean bagajCala;
    private boolean prioritateImbarcare;


    public BuilderBilet2() {
        this.locGeam = false;
        this.bagajCala = false;
        this.prioritateImbarcare = false;
    }


    @Override
    public Bilet2 build(String nume, String destinatie) {
        return new Bilet2(nume,destinatie,locGeam,bagajCala,prioritateImbarcare);
    }



    @Override
    public AbstractBilet2 set_LocGeam(boolean locGeam) {
        this.locGeam = locGeam;
        return this;
    }

    @Override
    public AbstractBilet2 set_bagajCala(boolean bagajCala) {
        this.bagajCala = bagajCala;
        return this;
    }

    @Override
    public AbstractBilet2 set_prioritateImbarcare(boolean prioritateImbarcare) {
        this.prioritateImbarcare = prioritateImbarcare;
        return this;
    }
}
