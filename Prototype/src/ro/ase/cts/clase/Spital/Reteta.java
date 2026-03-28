package ro.ase.cts.clase.Spital;

public class Reteta implements RetetaAbstracta{


    private String denumire;
    private int codReteta;
    private float concentratie;
    private int timpPreparare;

    public Reteta(String denumire, int codReteta, float concentratie, int timpPreparare) {
        this.denumire = denumire;
        this.codReteta = codReteta;
        this.concentratie = concentratie;
        this.timpPreparare = timpPreparare;
    }
    private Reteta(){}


    @Override
    public RetetaAbstracta clone() {

        Reteta retetaNoua = new Reteta();
        retetaNoua.denumire = this.denumire;
        retetaNoua.codReteta = this.codReteta;
        retetaNoua.concentratie = this.concentratie;
        retetaNoua.timpPreparare = this.timpPreparare;

return retetaNoua;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Reteta{");
        sb.append("denumire='").append(denumire).append('\'');
        sb.append(", codReteta=").append(codReteta);
        sb.append(", concentratie=").append(concentratie);
        sb.append(", timpPreparare=").append(timpPreparare);
        sb.append('}');
        return sb.toString();
    }




    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public void setCodReteta(int codReteta) {
        this.codReteta = codReteta;
    }

    public void setConcentratie(float concentratie) {
        this.concentratie = concentratie;
    }

    public void setTimpPreparare(int timpPreparare) {
        this.timpPreparare = timpPreparare;
    }
}
