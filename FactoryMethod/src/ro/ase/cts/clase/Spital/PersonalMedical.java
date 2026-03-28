package ro.ase.cts.clase.Spital;

public abstract class PersonalMedical implements PersonalSpital {
    protected String nume;
    protected String prenume;
    protected int varsta;
    protected int nrTelefon;
    protected String specializare;

    public PersonalMedical(String nume, String prenume, int varsta, int nrTelefon, String specializare) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
        this.nrTelefon = nrTelefon;
        this.specializare = specializare;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PersonalMedical{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", prenume='").append(prenume).append('\'');
        sb.append(", varsta=").append(varsta);
        sb.append(", nrTelefon=").append(nrTelefon);
        sb.append(", specializare='").append(specializare).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
