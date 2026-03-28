package ro.ase.cts.clase.Spital;

public abstract class PersonalNonMedical implements PersonalSpital {

    protected String nume;
    protected String prenume;
    protected int varsta;
    protected int nrTelefon;


    public PersonalNonMedical(String nume, String prenume, int varsta, int nrTelefon) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
        this.nrTelefon = nrTelefon;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PersonalNonMedical{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", prenume='").append(prenume).append('\'');
        sb.append(", varsta=").append(varsta);
        sb.append(", nrTelefon=").append(nrTelefon);
        sb.append('}');
        return sb.toString();
    }
}
