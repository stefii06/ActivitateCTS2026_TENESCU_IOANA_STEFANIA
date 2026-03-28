package ro.ase.cts.fabrici.Spital;

import ro.ase.cts.clase.Spital.PersonalSpital;
import ro.ase.cts.enums.Spital.TipPersonalSpital;

public interface FabricaAbstractaSpital {

    public PersonalSpital getPersonalSpital(TipPersonalSpital tipPersonalSpital, String nume, String prenume, int varsta, int nrTelefon, String specializare);
    public PersonalSpital getPersonalSpital(TipPersonalSpital tipPersonalSpital, String nume, String prenume, int varsta, int nrTelefon);

}
