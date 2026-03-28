package ro.ase.cts.clase.Spital;

public class Registrator extends PersonalNonMedical{

    public Registrator(String nume, String prenume, int varsta, int nrTelefon) {
        super(nume, prenume, varsta, nrTelefon);
    }

    @Override
    public void afisare() {
        StringBuilder sb = new StringBuilder();
        sb.append("Registratorul este  ").append(super.toString());
        System.out.println(sb.toString());
    }
}
