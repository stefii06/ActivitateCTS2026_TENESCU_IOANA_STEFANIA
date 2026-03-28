package ro.ase.cts.clase.Spital;

public class Secretar extends PersonalNonMedical{


    public Secretar(String nume, String prenume, int varsta, int nrTelefon) {
        super(nume, prenume, varsta, nrTelefon);
    }


    @Override
    public void afisare() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Secretarul este ").append(super.toString());
        System.out.println(sb.toString());
    }
}
