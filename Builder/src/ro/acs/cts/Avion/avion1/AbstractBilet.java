package ro.acs.cts.Avion.avion1;

public interface AbstractBilet {
    Bilet build();
    AbstractBilet set_Nume(String nume);
    AbstractBilet set_Destinatie(String destinatie);
    AbstractBilet set_LocGeam(boolean locGeam);
    AbstractBilet set_bagajCala(boolean bagajCala);
    AbstractBilet set_prioritateImbarcare(boolean prioritateImbarcare);

}
