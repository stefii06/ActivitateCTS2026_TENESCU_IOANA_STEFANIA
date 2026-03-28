package ro.ase.cts.main;

import ro.ase.cts.clase.Spital.PersonalSpital;
import ro.ase.cts.enums.Spital.TipPersonalMedical;
import ro.ase.cts.enums.Spital.TipPersonalNonMedical;
import ro.ase.cts.enums.Spital.TipPersonalSpital;
import ro.ase.cts.fabrici.Spital.FabricaPersonalMedical;
import ro.ase.cts.fabrici.Spital.FabricaPersonalNonMedical;

public class MainSpital {
    public static void main(String[] args) {
        FabricaPersonalMedical fabricaPersonalMedical = new FabricaPersonalMedical();
        FabricaPersonalNonMedical fabricaPersonalNonMedical = new FabricaPersonalNonMedical();

        PersonalSpital asistent = fabricaPersonalMedical.getPersonalSpital(TipPersonalMedical.ASISTENT,"Andrei","Popescu", 35, 0727334052, "oncologie");
        PersonalSpital medic = fabricaPersonalMedical.getPersonalSpital(TipPersonalMedical.MEDIC, "Vasile", "Badiu", 55, 0745232044, "ginecologie");

        PersonalSpital secretar = fabricaPersonalNonMedical.getPersonalSpital(TipPersonalNonMedical.SECRETAR, "Alex", "Cracou", 38, 07272223332);


        asistent.afisare();
        medic.afisare();
        secretar.afisare();
    }
}
