package ro.ase.cts.clase.STB;

public class Troleibuz extends MijlocTransport {

    public Troleibuz(int nrRoti, String nrInmatriculare) {
        super(nrRoti, nrInmatriculare);
    }

    @Override
    public void afisareDescriere() {
        StringBuilder sb = new StringBuilder("Troleibuzul are:");
        sb.append(" Numar roti: ").append(this.nrRoti);
        sb.append(", Numar Inmatriculare: ").append(this.nrInmatriculare);
        System.out.println(sb.toString());

    }
}
