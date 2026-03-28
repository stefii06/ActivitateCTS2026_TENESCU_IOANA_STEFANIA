package ro.ase.cts.clase.Spital;

public class Brancardier extends PersonalMedical {
    public Brancardier(String nume, String prenume, int varsta, int nrTelefon, String specializare) {
        super(nume, prenume, varsta, nrTelefon, specializare);
    }

    @Override
    public void afisare() {
        StringBuilder sb = new StringBuilder();
        sb.append("Brancardierul este  ").append(super.toString());
        System.out.println(sb.toString());
    }
}
