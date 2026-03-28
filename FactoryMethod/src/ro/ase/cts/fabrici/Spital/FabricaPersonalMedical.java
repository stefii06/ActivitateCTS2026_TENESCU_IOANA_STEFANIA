package ro.ase.cts.fabrici.Spital;

import ro.ase.cts.clase.Spital.Asistent;
import ro.ase.cts.clase.Spital.Brancardier;
import ro.ase.cts.clase.Spital.Medic;
import ro.ase.cts.clase.Spital.PersonalSpital;
import ro.ase.cts.enums.Spital.TipPersonalMedical;
import ro.ase.cts.enums.Spital.TipPersonalSpital;

public class FabricaPersonalMedical implements FabricaAbstractaSpital{

    @Override
    public PersonalSpital getPersonalSpital(TipPersonalSpital tipPersonalSpital, String nume, String prenume, int varsta, int nrTelefon, String specializare) {
       if (tipPersonalSpital==TipPersonalMedical.MEDIC){
           return new Medic(nume,prenume,varsta,nrTelefon,specializare);
       } else if (tipPersonalSpital==TipPersonalMedical.ASISTENT) {
           return new Asistent(nume,prenume,varsta,nrTelefon,specializare);
       } else if (tipPersonalSpital==TipPersonalMedical.BRANCARDIER) {
           return new Brancardier(nume,prenume,varsta,nrTelefon,specializare);
       }

        return null;
    }

    @Override
    public PersonalSpital getPersonalSpital(TipPersonalSpital tipPersonalSpital, String nume, String prenume, int varsta, int nrTelefon) {
        return  getPersonalSpital(tipPersonalSpital,nume,prenume,varsta,nrTelefon);
    }
}
