package ro.ase.cts.fabrici.Spital;

import ro.ase.cts.clase.Spital.PersonalSpital;
import ro.ase.cts.clase.Spital.Registrator;
import ro.ase.cts.clase.Spital.Secretar;
import ro.ase.cts.enums.Spital.TipPersonalNonMedical;
import ro.ase.cts.enums.Spital.TipPersonalSpital;

public class FabricaPersonalNonMedical implements FabricaAbstractaSpital{


    @Override
    public PersonalSpital getPersonalSpital(TipPersonalSpital tipPersonalSpital, String nume, String prenume, int varsta, int nrTelefon, String specializare) {
        return getPersonalSpital(tipPersonalSpital, nume, prenume, varsta, nrTelefon, specializare);
    }

    @Override
    public PersonalSpital getPersonalSpital(TipPersonalSpital tipPersonalSpital, String nume, String prenume, int varsta, int nrTelefon) {

        if(tipPersonalSpital== TipPersonalNonMedical.REGISTRATOR){
            return new Registrator(nume, prenume, varsta, nrTelefon);
        } else if( tipPersonalSpital==TipPersonalNonMedical.SECRETAR){
            return new Secretar(nume, prenume, varsta, nrTelefon);
        }
        return null;
    }
}
