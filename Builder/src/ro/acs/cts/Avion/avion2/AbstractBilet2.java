package ro.acs.cts.Avion.avion2;

import ro.acs.cts.Avion.avion1.AbstractBilet;

public interface AbstractBilet2 {
    Bilet2 build(String nume, String destinatie);
    AbstractBilet2 set_LocGeam(boolean locGeam);
    AbstractBilet2 set_bagajCala(boolean bagajCala);
    AbstractBilet2 set_prioritateImbarcare(boolean prioritateImbarcare);
}
